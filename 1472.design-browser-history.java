/*
 * @lc app=leetcode id=1472 lang=java
 *
 * [1472] Design Browser History
 */

// @lc code=start
class BrowserHistory 
{
    public static class Website
    {
        Website prev, next;
        String name;
        public Website(String name)
        {
            this.name= name;
        }
    }

    Website homepage, pointer;
    public BrowserHistory(String homepage) 
    {
        this.homepage= new Website(homepage);
        pointer= this.homepage;
    }
    
    public void visit(String url) 
    {
        Website nigga= new Website(url);
        pointer.next= nigga;
        nigga.prev= pointer;
        pointer= nigga;
    }
    
    public String back(int steps) 
    {
        Website temp= pointer;
        while(steps-->0 && temp.prev!=null)
        {
            temp= temp.prev;
        }
        pointer= temp;
        return pointer.name;
    }
    
    public String forward(int steps) 
    {
        Website temp= pointer;
        while(steps-->0 && temp.next!=null)
        {
            temp= temp.next;
        }
        pointer= temp;
        return pointer.name;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
// @lc code=end

