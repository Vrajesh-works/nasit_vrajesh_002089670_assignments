let studentCount = 1;  // Start counting from 1 for user-friendly row IDs

function initializePage() {
    // Display Full Name and NUID
    document.getElementById('userInfo').innerHTML = "Your Name: Vrajesh Nasit | NUID: 002089670";
}

function handleCheckbox(checkbox, rowId) {
    const row = checkbox.parentNode.parentNode;
    const submitButton = document.getElementById("button");
    if (checkbox.checked) {
        row.style.backgroundColor = "yellow";
        submitButton.disabled = false;
        submitButton.classList.add('enabled');
        addDeleteButton(row);
        addEditButton(row);
    } else {
        row.style.backgroundColor = "";
        removeDeleteButton(row);
        removeEditButton(row);
        const checkboxes = document.querySelectorAll('#myTable input[type="checkbox"]');
        const anyChecked = Array.from(checkboxes).some(checkbox => checkbox.checked);
        if (!anyChecked) {
            submitButton.disabled = true;
            submitButton.classList.remove('enabled');
        }
    }
}

function addNewStudent() {
    studentCount++;  // Increment the count for new students

    const table = document.getElementById("myTable");

    // Insert new row for the student
    const newRow = table.insertRow(-1);
    const checkboxCell = newRow.insertCell(0);
    checkboxCell.innerHTML = `<input type="checkbox" onclick="handleCheckbox(this, ${studentCount})" /><br /><br /><img src="down.png" width="25px" onclick="toggleRow(${studentCount})" />`;

    newRow.insertCell(1).innerHTML = `Student ${studentCount}`;
    newRow.insertCell(2).innerHTML = `Teacher ${studentCount}`;
    newRow.insertCell(3).innerHTML = 'Approved';
    newRow.insertCell(4).innerHTML = 'Fall';
    newRow.insertCell(5).innerHTML = 'TA';
    newRow.insertCell(6).innerHTML = '12345';
    newRow.insertCell(7).innerHTML = '100%';
    newRow.insertCell(8).innerHTML = '';  // Delete button will be added dynamically
    newRow.insertCell(9).innerHTML = '';  // Edit button will be added dynamically

    // Insert a hidden dropdown row for additional student details
    const dropdownRow = table.insertRow(-1);
    dropdownRow.className = "dropDownTextArea";
    dropdownRow.id = `dropDown${studentCount}`;
    dropdownRow.innerHTML = `<td colspan="10">
        Advisor: Teacher ${studentCount}<br />
        Award Details: Summer 1-2014 (TA)<br />
        Budget Number: 12345<br />
        Comments: Excellent performance<br />
    </td>`;

    // Add delete and edit buttons
    addDeleteButton(newRow);
    addEditButton(newRow);

    // Display a success message in a popup
    alert(`Student ${studentCount} Record added successfully`);
}

function addDeleteButton(row) {
    const deleteCell = row.cells[8];
    deleteCell.innerHTML = `<button onclick="deleteRow(this)">Delete</button>`;
}

function removeDeleteButton(row) {
    const deleteCell = row.cells[8];
    deleteCell.innerHTML = '';
}

function deleteRow(button) {
    const row = button.parentNode.parentNode;
    const rowIndex = row.rowIndex; // Get the index of the row being deleted
    const table = document.getElementById("myTable");

    // Remove the corresponding dropdown row if it exists
    const dropdownRow = table.rows[rowIndex + 1]; // Dropdown row is the next row
    if (dropdownRow && dropdownRow.classList.contains("dropDownTextArea")) {
        table.deleteRow(rowIndex + 1); // Delete the dropdown row
    }

    // Now remove the student row
    table.deleteRow(rowIndex);
    
    alert(`Student Record deleted successfully`);
}

function addEditButton(row) {
    const editCell = row.cells[9];
    const rowId = row.rowIndex; // Get the row index directly
    editCell.innerHTML = `<button onclick="editRow(${rowId})">Edit</button>`;
}

function removeEditButton(row) {
    const editCell = row.cells[9];
    editCell.innerHTML = '';
}

function editRow(rowId) {
    const table = document.getElementById("myTable");
    const row = table.rows[rowId];  // Get the specific row being edited

    // Extract the student details
    const studentName = row.cells[1].innerHTML;
    const advisor = row.cells[2].innerHTML;
    const awardStatus = row.cells[3].innerHTML;
    const semester = row.cells[4].innerHTML;
    const type = row.cells[5].innerHTML;
    const budget = row.cells[6].innerHTML;
    const percentage = row.cells[7].innerHTML;

    // Create the pop-up modal content
    const modalContent = `
        <div id="editModal" class="modal">
            <div class="modal-content">
                <h2>Edit details of ${studentName}</h2>
                <p><strong>Student Name:</strong> ${studentName}</p>
                <p><strong>Advisor:</strong> ${advisor}</p>
                <p><strong>Award Status:</strong> ${awardStatus}</p>
                <p><strong>Semester:</strong> ${semester}</p>
                <p><strong>Type:</strong> ${type}</p>
                <p><strong>Budget #:</strong> ${budget}</p>
                <p><strong>Percentage:</strong> ${percentage}</p>
                <button onclick="updateRow(${rowId})">Update</button>
                <button onclick="closeModal()">Cancel</button>
            </div>
        </div>
    `;

    // Append the modal to the body
    document.body.insertAdjacentHTML('beforeend', modalContent);

    // Display the modal
    document.getElementById("editModal").style.display = "block";
}

function closeModal() {
    const modal = document.getElementById("editModal");
    if (modal) {
        modal.remove();  // Remove modal from the DOM
    }
}

function updateRow(rowId) {
    alert(`Student ${rowId} data updated successfully`);
    closeModal();  // Close the modal after updating
}

function toggleRow(rowId) {
    const dropdownRow = document.getElementById(`dropDown${rowId}`);
    if (dropdownRow.style.display === "none") {
        dropdownRow.style.display = "table-row";
    } else {
        dropdownRow.style.display = "none";
    }
}
