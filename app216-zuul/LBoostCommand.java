/**
 * This command allows the player to
 * take or pickup an item from a room
 * and carry it around to use somewhere
 * else
 *
 * @author Derek Peacock & Nicholas Day
 * @version 2021-08-23
 * 
 * Modified and extended by Liam Smith 27/12/21
 */
public class LBoostCommand extends ZuulCommand
{   

    public LBoostCommand(Game zuul)
    {
        super(zuul);
    }

    public void execute()
    {
        zuul.MAP.teleport();
    }
}