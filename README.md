# prog_assignment_part_two_ST10375204
doubleVerification,intVerification and validateDecision methods:
they all rely on the same structure, that being a try catch for loop
they only differ in what they are checking.
they accept take message, from main and echo it as long as the user
does not give a valid input in their prompts

this allows the main to be a lot shorter, as they can be reuses multiple times
at the cost of one line, as opposed to writing these checks in main
