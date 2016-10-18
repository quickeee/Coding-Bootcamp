#Start of the algorithm... Inserting the maze dimensions...
n = input("Please enter the dimensions of the maze in a format of: X ")
#Check in order the maze will be bigger than 2x2 and also that a user cannot enter negative dimensions...
while int(n) < 2:
    print ("The dimensions of the maze have to be >= 2!! please enter again: ")
    n = input()
    mazedimensions = [str(int(n)),str(int(n))]

#Inserting the start point...
spointstring = input("Please enter the starting point of the actor in a format of column,row (please note that point 0,0 is the bottom left): ")
spoint = spointstring.split(',')
#Check that the start point belongs to the maze...
while (int(spoint[0]) < 0) or (int(spoint[1]) < 0)\
or ((int(spoint[0])>int(mazedimensions[0])-1)\
or (int(spoint[1])>int(mazedimensions[1])-1)):
    print ("The coordinates of the start point are invalid! Please remember, start point has to be inside the maze! enter again: ")
    spointstring = input()
    spoint = spointstring.split(',')

#Inserting the exit point...
gpointstring = input("Please enter the exit point in a fotmat of column,row: ")
gpoint = gpointstring.split(',')
#Check that the exit point belongs to the maze and also does not coincide with the start point...
while (int(gpoint[0]) < 0) or (int(gpoint[1]) < 0)\
or ((int(gpoint[0])>int(mazedimensions[0])-1)\
or (int(gpoint[1])>int(mazedimensions[1])-1))\
or (int(gpoint[0])==int(spoint[0]) and int(gpoint[1])==int(spoint[1])):
    print ("The coordinates of the exit point are invalid! Please remember exit point has to be inside the maze and can't coincide with start point! enter again: ")
    gpointstring = input()
    gpoint = gpointstring.split(',')

#Inserting the wall blocks that the maze has...
blocks_string = input("Please enter the points that are wall blocks in a format of column,row and space between each point. Always remember that point 0,0 is the bottom left: ")
#We are going to remove the whitespaces at the end of the string! This is important for the length!
blocks_string = blocks_string.rstrip()
#First we split the inserted string so we seperate the pairs into a new list...
wall_blocks_string = blocks_string.split(' ')
#In order to avoid dublicate blocks, in case a user decide to enter the same block 2 times we are going to use a middle set, so:
middleset = set(wall_blocks_string)
wall_blocks_string = list(set(wall_blocks_string))
#Now we creat a nested list so we can seperate each pair...
wall_blocks = []
for i in range(len(wall_blocks_string)):
    wall_blocks.append(wall_blocks_string[i].split(','))
wall_blocks_col = []
wall_blocks_row = []
#And now we save the coordinate of each pair seperately...
for i in range(len(wall_blocks)):
    wall_blocks_col.append(wall_blocks[i][0])
    wall_blocks_row.append(wall_blocks[i][1])
#The check begics! We check if the inserted wall blocks are inside the maze range,
#also if any block coincide with either the start point or the exit point!
k = 0
while k == 0:
    for i in range(len(wall_blocks_string)):
        if (int(wall_blocks_col[i]) > int(mazedimensions[0])-1)\
            or (int(wall_blocks_row[i]) > int(mazedimensions[1])-1)\
            or (int(wall_blocks_col[i]) < 0)\
            or (int(wall_blocks_row[i]) < 0)\
            or ((int(wall_blocks_col[i])==int(spoint[0])) and (int(wall_blocks_row[i])==int(spoint[1])))\
            or ((int(wall_blocks_col[i])==int(gpoint[0])) and (int(wall_blocks_row[i])==int(gpoint[1]))):
            print ('invalid coordinates for wall blocks. Please remember wall blocks have to be inside the maze and not coincide with either starting point or exit point! enter again: ')
            blocks_string = input()
            blocks_string = blocks_string.rstrip()
            wall_blocks_string = blocks_string.split(' ')
            wall_blocks = []
            middleset = set(wall_blocks_string)
            wall_blocks_string = list(set(wall_blocks_string))
            for j in range(len(wall_blocks_string)):
                wall_blocks.append(wall_blocks_string[j].split(','))
            wall_blocks_col = []
            wall_blocks_row = []
            for p in range(len(wall_blocks)):
                wall_blocks_col.append(wall_blocks[p][0])
                wall_blocks_row.append(wall_blocks[p][1])
            k = 0
            break
        else:
            k = 1
#The following step is an idea of optimization i had... If a cell is surrounded by 3 wall blocks, then the sell is useless for the path
#so i turn it to a wall block...
blockscol = []
blocksrow = []
for x in range(len(wall_blocks_col)):
    blockscol.append(int(wall_blocks_col[x]))
    blocksrow.append(int(wall_blocks_row[x]))
coords = []
for x in range(len(wall_blocks_col)):
    coords.append([blockscol[x],blocksrow[x]])
print (coords)

#The creation of the maze just begins!
maze = []
#We create nested list inside the list maze...
for i in range(int(mazedimensions[0])):
    maze.append([])
#And finally we create the maze with all the information the user inserted above! We set the start point the exit point and the wall blocks!
for i in range(int(mazedimensions[0])):
    for j in range(int(mazedimensions[1])):
        if i == int(gpoint[0]) and j == int(gpoint[1]):
            maze[i].append(2)
        elif i == int(spoint[0]) and j == int(spoint[1]):
            maze[i].append(0)
        else:
            maze[i].append(0)
#We start for each column and scan each row from bottom to top... If both i,j exists in same position of my lists wall_blocks_col and
#wall_blocks_row then we put 1 in that position...
for i in range(int(mazedimensions[0])):
    for j in range(int(mazedimensions[1])):
        for k in range(len(wall_blocks_col)):
            if i == int(wall_blocks_col[k]) and j == int(wall_blocks_row[k]):
                maze[i][j] = 1
print (maze)
root = []
# In the following function the basic logic is that we encrypt each cell of the maze as follows: 0 is an empty block
#the starting point is also 0 but we start the searching from the starting point...
#1 is a wall block cell and finally 3 is a visited cell... We know all the values from the entry except the visited one, which we add
#when the actor goes to any empty cell...
#Plus on this, this is a recursive function who calls herself over and over till the exit is found...
def MazeSolution(x,y):
    k = 0
    if maze[x][y] == 2:
        print ('I finally exited the labyrinth!!!!!! The door is at: ',x,',',y)
        k = 1
        return k
    elif maze[x][y] == 1:
        print ('There is a wall block here! ',x,',',y)
        k = 0
        return k
    elif maze[x][y] == 3:
        print ("Don't fun with me! I have already gone in: ",x,",",y)
        k = 0
        return k
    print ('Despite i am tired, i am going to: ',x,',',y)
    root.append([x,y])
#In this section we are doing checks clockwise...
    maze[x][y] = 3
    if ((x < len(maze)-1 and MazeSolution(x+1, y))
        or (y > 0 and MazeSolution(x, y-1))
        or (x > 0 and MazeSolution(x-1, y))
        or (y < len(maze)-1 and MazeSolution(x, y+1))):
        k = 1
        return k
    k = 0
    return k
MazeSolution(int(spoint[0]),int(spoint[1]))
#Finally in order to print the whole path we are gonna just print the root list...
for i in range(len(root)):
    print (root[i])
print (gpoint)


''' I used some resources in the internet in order to acomplish this program! I used the python documentation:
https://docs.python.org/3/tutorial/index.html
also i used a mathematical algorithm for solutions for mazes found at:
http://www.laurentluce.com/posts/solving-mazes-using-python-simple-recursivity-and-a-search/'''
