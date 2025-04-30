import os

i = 1
while i < 11:
    # Modify a file (for example, creating or updating a text file with the current iteration number)
    with open("file.txt", "w") as f:
        f.write(f"Change {i}\n")
    
    # Stage the changes
    os.system("git add .")
    
    # Commit with a dynamic message
    os.system(f'git commit -m "Commit number {i}"')
    
    # Push to the main branch
    os.system("git push origin main")
    
    i += 1
