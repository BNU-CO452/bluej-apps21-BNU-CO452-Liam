/**
 * This command allows the player to
 * remove an item that is equipped
 *
 * @author Derek Peacock & Nicholas Day
 * @version 2021-08-23
 * 
 * Modified and extended by Liam Smith 27/12/21
 */
public class RemoveCommand extends ZuulCommand
{
    String item;
    Item whatItem;
    
    /**
     * Use an item
     */
    public RemoveCommand(Game zuul, String item)
    {
        super(zuul);
        this.item = item;
    }    

    public void execute()
    {
        String message;
        boolean carrying = false;

        if(item == null) 
        {
            // if there is no second word, we don't know what to remove...
            message = "Remove what?";
        }

        else
        {

            for (int i = 0; i < zuul.player.inventory.size(); i++)
            {
                if (zuul.player.inventory.get(i).getDescription().equals(item))
                {
                    carrying = true;
                    whatItem = zuul.player.inventory.get(i);
                }
            }

            if (carrying == true)
            {
                switch(item)
                {
                    case "gasmask":
                        if (zuul.player.gasMask == true) {
                            zuul.player.removeGasMask();
                            message = "gas mask removed";
                        }
                        
                        else
                        {
                            message = "gas mask is not equipped";
                        }                        
                        break;

                    case "armour":
                        if (zuul.player.armour == true) {
                            zuul.player.removeArmour();
                            message = "armour removed";
                        }
                        
                        else
                        {
                            message = "armour is not equipped";
                        }   
                        break;

                    default:
                        message = "";
                        break;
                  }
            }

            else
            {
                message = " you do not have this item equipped";
            }
        }
        System.out.println(message);
    }
}