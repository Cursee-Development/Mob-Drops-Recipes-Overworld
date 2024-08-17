import os

# Define the folder path
folder_path = 'recipe'

# Iterate over all files in the folder
for filename in os.listdir(folder_path):
    file_path = os.path.join(folder_path, filename)

    # Check if it's a file
    if os.path.isfile(file_path):
        # Read the file's content
        with open(file_path, 'r') as file:
            content = file.read()

        # Find the last instance of "hello" and replace it with "goodbye"
        if 'item' in content:
            content = content[::-1].replace('meti', 'di', 1)[::-1]

            # Write the modified content back to the file
            with open(file_path, 'w') as file:
                file.write(content)

print("Replacement complete!")
