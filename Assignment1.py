import random

# method written for walking simulation
def simulate(A, B):

    # Boris and Kete positions setting here
    px, py = 0, B-1
    cx, cy = A-1, 0
    timestep = 0

    # loop for 1 million time steps
    while timestep < 1000000:
        timestep += 1

        # move Boris and Kete towards any of the valid 8 directions
        px += random.choice([-1, 0, 1])
        py += random.choice([-1, 0, 1])
        cx += random.choice([-1, 0, 1])
        cy += random.choice([-1, 0, 1])

        # when reached boundary before back
        if px >= A:
            px = A-1
        elif px < 0:
            px = 0
        if py >= B:
            py = B-1
        elif py < 0:
            py = 0
            
        if cx >= A:
            cx = A-1
        elif cx < 0:
            cx = 0
        if cy >= B:
            cy = B-1
        elif cy < 0:
            cy = 0
        
        # when position matching return time taken
        if px==cx and py==cy:
            return timestep
    
    # if position not reached on 1 million
    return timestep

# driver code
def main():
    A, B = 0, 0

    # input values here
    while True:
        A = int(input('Enter A such that 2<=A<=50: '))
        if A >= 2 and A <= 50:
            break
        print('INVALID LENGTH')
    while True:
        B = int(input('Enter B such that 2<=B<=50: '))
        if B >= 2 and B <= 50:
            break
        print('INVALID LENGTH')
    
    # display result
    print('Time required to meet: ', simulate(A, B))
main()
