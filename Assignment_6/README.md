# Online Gaming Platform

This project is a two-page website showcasing an online gaming platform. The website features modern UI elements with responsive design, powered by CSS Grid, Flexbox, and SASS/SCSS.

## Features Implemented

- **CSS Grid**: Used to create a flexible, responsive layout for the games section on the homepage (`_grid.scss`).
- **Flexbox**: Utilized for the hero section and navigation bar to align content dynamically (`_flexbox.scss`).
- **Variables**: Defined global color variables for consistent design (`_colors.scss`).
- **Nesting**: Clean and readable styles with SCSS nesting (`_navbar.scss`, `_buttons.scss`).
- **Mixins**: Reusable mixins for buttons, flex-center alignment, and responsive media queries (`_mixins.scss`).
- **Functions**: Added functions for converting px to rem and managing rgba colors (`_functions.scss`).
- **Hover Effects**: Smooth hover transitions for buttons and cards to improve interactivity (`_cards.scss`, `_buttons.scss`).

## Folder Structure

- **base**: Contains reset and typography styles.
- **components**: Includes styles for buttons, cards, and navbar.
- **layout**: Contains grid and flexbox layout files.
- **themes**: Manages the color scheme of the site.
- **utils**: Includes mixins and functions for reusable code.

## How to Run

1. Clone the repository.
2. Run the project by opening `index.html` in your browser.
3. Compile the SASS files using the following command:
   ```bash
   sass styles/styles.scss styles/styles.css
