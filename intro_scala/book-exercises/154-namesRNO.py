##
#   Display all of the girls and boys names that were the most 
#   popular in at least one year between 1900 and 2012
##

FIRST_YEAR = 1900
LAST_YEAR = 2012

##
#   Load the first line from the line from the file, 
#   extract the name, and add it to the names list if it is not 
#   already present
#   @param the name of the file to read the data from
#   @param the list to add the name to (if itsnt already present)
#   @return (None)

def LoadAndAdd(fname,names):
    #Open the file, read the first line, and extract the name
    inf = open(fname,"r")
    line = inf.readline()
    inf.close()
    parts=line.split()
    name = parts[0]

    #Add the name to the list if it is not already present
    if name not in names:
        names.append(name)

# Display the girls and boys names that reached #1 in at least 
# one year between 1900 and 2012
def main():
    # Create two lists to store the most popular names
    girls = []
    boys = []

    # Process each year in the range, reading the first line 
    # out of the girl file and boys file
    for year in range(FIRST_YEAR,LAST_YEAR+1):
        girl_fname="../Data/BabyNames/" + str(year) + "_GirlsNames.txt"
        boy_fname="../DataBabyNames/" + str(year) + "_BoysNames.txt"
        LoadAndAdd(girl_fname,girls)
        LoadAndAdd(boy_fname,boys)
    
    #Display the lists
    print("Girls names that reached #1:")
    for name in girls:
        print(" ",name)
    print()
    print("Boys names that reached #1: ")
    for name in boys:
        print(" ",name)

# Call the main function
main()


