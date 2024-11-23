## Grid Layout in java

This Java program demonstrates the use of the `GridLayout` layout manager in a Swing-based GUI application. The application creates a `JFrame` containing multiple `JButton` components arranged in a grid pattern. Each button is styled with alternating background colors and has focus disabled to provide a clean visual experience.

This program is perfect for beginners learning Swing and layout management or for anyone experimenting with creating simple, visually appealing grid-based interfaces.

--------------------

## Features

- Grid Layout: Utilizes a `GridLayout` with 3 rows, 3 columns, and a 5-pixel gap between components.

- Custom Button Styles: Buttons have alternating blue and green backgrounds for better visual distinction.

- Resizable Window: The `JFrame` is resizable, allowing users to observe how the grid layout adapts to different window sizes.

- Focus Disabled: Button focus is disabled for a cleaner user interface.

------------------

## Requirements

- Java Version: Java 17 or higher (ensures compatibility with modern Java features).

- Maven: Optional, if you want to manage dependencies or package the project.

---------------

## Example Output

When you run the program:

- A window (`JFrame`) appears with 9 buttons arranged in a 3x3 grid.

- Buttons alternate between blue and green background colors.

-----------------

## Code Highlights

- GridLayout Usage: Demonstrates how to set up a `GridLayout` with rows, columns, and gaps.

- Focus Control: Disables button focus using `setFocusable(false)` for better UX.

- Component Styling: Shows how to customize Swing components (e.g., button colors).

- The grid adapts dynamically to window resizing.

-------------

## Preview

Visual Representation
```bash
| Button1 | Button2 | Button3 |
|---------|---------|---------|
| Button4 | Button5 | Button6 |
|---------|---------|---------|
| Button7 | Button8 | Button9 |
```
