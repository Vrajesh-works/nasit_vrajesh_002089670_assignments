document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('myForm');
    const nameInput = document.getElementById('name');
    const emailInput = document.getElementById('email');
    const phoneInput = document.getElementById('phone');
    const zipInput = document.getElementById('zip');
    const listSelect = document.getElementById('list');
    const dynamicCheckbox = document.getElementById('dynamicCheckbox');
    const dynamicTextField = document.getElementById('dynamicTextField');
    const submitBtn = document.getElementById('submitBtn');
    const table = document.getElementById('dataTable');
    const tableBody = document.getElementById('tableBody');

    function validateForm() {
        let valid = true;

        // Name validation
        if (!/^[a-zA-Z0-9]{3,20}$/.test(nameInput.value)) {
            document.getElementById('nameError').classList.remove('hidden');
            valid = false;
        } else {
            document.getElementById('nameError').classList.add('hidden');
        }

        // Email validation
        if (!/^[a-zA-Z0-9._%+-]+@northeastern.edu$/.test(emailInput.value)) {
            document.getElementById('emailError').classList.remove('hidden');
            valid = false;
        } else {
            document.getElementById('emailError').classList.add('hidden');
        }

        // Phone validation
        if (!/^\d{10}$/.test(phoneInput.value)) {
            document.getElementById('phoneError').classList.remove('hidden');
            valid = false;
        } else {
            document.getElementById('phoneError').classList.add('hidden');
        }

        // Zip validation
        if (!/^\d{5}$/.test(zipInput.value)) {
            document.getElementById('zipError').classList.remove('hidden');
            valid = false;
        } else {
            document.getElementById('zipError').classList.add('hidden');
        }

        // Enable submit button if everything is valid
        submitBtn.disabled = !valid;
    }

    // Keyup event listeners for real-time validation
    nameInput.addEventListener('keyup', validateForm);
    emailInput.addEventListener('keyup', validateForm);
    phoneInput.addEventListener('keyup', validateForm);
    zipInput.addEventListener('keyup', validateForm);

    // Handle checkbox change
    dynamicCheckbox.addEventListener('change', function () {
        if (this.checked) {
            dynamicTextField.classList.remove('hidden');
            dynamicTextField.required = true;
        } else {
            dynamicTextField.classList.add('hidden');
            dynamicTextField.required = false;
        }
    });

    // Form submission event
    form.addEventListener('submit', function (e) {
        e.preventDefault();

        // Add data to table
        const row = tableBody.insertRow();
        row.insertCell(0).textContent = nameInput.value;
        row.insertCell(1).textContent = emailInput.value;
        row.insertCell(2).textContent = phoneInput.value;
        row.insertCell(3).textContent = zipInput.value;
        row.insertCell(4).textContent = listSelect.value;
        row.insertCell(5).textContent = dynamicCheckbox.checked ? dynamicTextField.value : '';

        // Show table
        table.style.display = 'block';

        // Clear form
        form.reset();
        submitBtn.disabled = true;
        dynamicTextField.classList.add('hidden');
    });
});
