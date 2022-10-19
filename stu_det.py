li = []
stu=[]

#function for entering student details
def insrt(name,usn,marks):
    li.append([name,usn,int(marks)])

#function for updating student details     
def update(usn,name,marks):
    for i in range(len(li)):
        if usn in li[i]:           
            li[i][0] = name
            li[i][2] = int(marks)  
            return    
    print("USN doesn't exist")      

#function for deleting student details 
def delete_det(usn):
    for i in range(len(li)):
        if usn in li[i]:
            del li[i]
            return
    print("USN doesn't exist")

#function for displaying student details 
def sel():
    if len(li)!=0:
        print("Element in the list are:")
        print("name\tusn\tmarks")
        for i in range(len(li)):
            print("%s\t%s\t%d"%(li[i][0],li[i][1],li[i][2]))                   
    else:
        print("List is empty")   

#main function        
while True:
    ch = int(input("MENU\n1.Insert\n2.Update\n3.Delete\n4.Select\n5.Exit\nEnter your choice\n"))
    if(ch == 1):
        name,usn,marks = input("Enter the name usn and marks\n").split()
        insrt(name,usn,marks)
    elif(ch == 2):
        usn = input("Enter the usn whose details neeeds to updated\n")
        name,marks = input("Enter the new name and marks which needs to be replaced\n").split()
        update(usn,name,marks)
    elif(ch == 3):
        usn = input("Enter the usn whose details needs to be deleted\n")
        delete_det(usn)    
    elif(ch == 4):    
        sel()
    elif(ch == 5):
        exit()
    else:
        print("invalid choice\n")    