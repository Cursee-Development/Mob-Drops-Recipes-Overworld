import os

# Define the directory containing the files
directory = "recipes"

# Iterate over all files in the directory
for filename in os.listdir(directory):
    filepath = os.path.join(directory, filename)

    # Only process files, skip directories
    if os.path.isfile(filepath):
        # Open and read the file
        with open(filepath, 'r') as file:
            content = file.read()

        # Replace occurrences of "hello" with "goodbye"
        updated_content = content.replace("mobdropsrecipes_overworld", "mob_drops_recipes_overworld")

        # Write the updated content back to the file
        with open(filepath, 'w') as file:
            file.write(updated_content)

print("Replacement complete!")
