def fdist( ftime ):
    grav = 9.8
    dist = ( 1 / 2 ) * grav * ( ftime ** 2 )
    return dist

def main():
    print( "Time\tFalling Distance\n" )
    for ctime in range( 1, 11):
        print( ctime, "\t", format( fdist( ctime ), ".2f" ) )

main()
