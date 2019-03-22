package com.springrest;

import java.util.ArrayList;
import java.util.List;

public class BlogMockedData {

    private List<Blog> blogs;

    private static BlogMockedData instance = null;
    public static BlogMockedData getInstance(){
        if (instance == null){
            instance = new BlogMockedData();
        }

        return instance;
    }

    public BlogMockedData(){
        blogs = new ArrayList<Blog>();
        blogs.add(new Blog(1, "Go up, up and away with your Google Assistant",
                "With holiday travel coming up, and 2018 just around the corner, " +
                        "you may be already thinking about getaways for next year. Consider " +
                        "the Google Assistant your new travel buddy, ready at the drop of a hat—or a passport"));
        blogs.add(new Blog(2, "Go up, up and away with your Google Assistant",
                "With holiday travel coming up, and 2018 just around the corner, " +
                        "you may be already thinking about getaways for next year. Consider " +
                        "the Google Assistant your new travel buddy, ready at the drop of a hat—or a passport"));
        blogs.add(new Blog(3, "Go up, up and away with your Google Assistant",
                "With holiday travel coming up, and 2018 just around the corner, " +
                        "you may be already thinking about getaways for next year. Consider " +
                        "the Google Assistant your new travel buddy, ready at the drop of a hat—or a passport"));
        blogs.add(new Blog(4, "Go up, up and away with your Google Assistant",
                "With holiday travel coming up, and 2018 just around the corner, " +
                        "you may be already thinking about getaways for next year. Consider " +
                        "the Google Assistant your new travel buddy, ready at the drop of a hat—or a passport"));
        blogs.add(new Blog(5, "Go up, up and away with your Google Assistant",
                "With holiday travel coming up, and 2018 just around the corner, " +
                        "you may be already thinking about getaways for next year. Consider " +
                        "the Google Assistant your new travel buddy, ready at the drop of a hat—or a passport"));
        blogs.add(new Blog(6, "Go up, up and away with your Google Assistant",
                "With holiday travel coming up, and 2018 just around the corner, " +
                        "you may be already thinking about getaways for next year. Consider " +
                        "the Google Assistant your new travel buddy, ready at the drop of a hat—or a passport"));
        blogs.add(new Blog(7, "Go up, up and away with your Google Assistant",
                "With holiday travel coming up, and 2018 just around the corner, " +
                        "you may be already thinking about getaways for next year. Consider " +
                        "the Google Assistant your new travel buddy, ready at the drop of a hat—or a passport"));
        blogs.add(new Blog(8, "Go up, up and away with your Google Assistant",
                "With holiday travel coming up, and 2018 just around the corner, " +
                        "you may be already thinking about getaways for next year. Consider " +
                        "the Google Assistant your new travel buddy, ready at the drop of a hat—or a passport"));
        blogs.add(new Blog(9, "Go up, up and away with your Google Assistant",
                "With holiday travel coming up, and 2018 just around the corner, " +
                        "you may be already thinking about getaways for next year. Consider " +
                        "the Google Assistant your new travel buddy, ready at the drop of a hat—or a passport"));
        blogs.add(new Blog(10, "Go up, up and away with your Google Assistant",
                "With holiday travel coming up, and 2018 just around the corner, " +
                        "you may be already thinking about getaways for next year. Consider " +
                        "the Google Assistant your new travel buddy, ready at the drop of a hat—or a passport"));
        blogs.add(new Blog(11, "Go up, up and away with your Google Assistant",
                "With holiday travel coming up, and 2018 just around the corner, " +
                        "you may be already thinking about getaways for next year. Consider " +
                        "the Google Assistant your new travel buddy, ready at the drop of a hat—or a passport"));
    }

    // return all blogs
    public List<Blog> fetchBlogs(){
        return blogs;
    }

    // return by id blog
    public Blog getById(int id){
        for (Blog b:blogs){
            if(b.getId() == id){
                return b;
            }
        }

        return null;
    }

    // search blog by text
    public List<Blog> searchBlogs(String searchTerm){
        List<Blog> searchedBlos = new ArrayList<Blog>();
        for (Blog b:blogs){
            if(b.getTitle().toLowerCase().contains(searchTerm.toLowerCase()) || b.getContent().toLowerCase().contains(searchTerm.toLowerCase())){
                searchedBlos.add(b);
            }
        }

        return  searchedBlos;
    }

    // create new blog
    public Blog createBlog(int id, String title, String content){
        Blog blog = new Blog(id, title, content);
        blogs.add(blog);
        return blog;
    }

    // update blog
    public Blog updateBlog(int id, String title, String content){
        for (Blog b:blogs){
            if (b.getId() == id){
                int blogIndex = blogs.indexOf(b);
                b.setTitle(title);
                b.setContent(content);
                blogs.set(blogIndex, b);
                return b;
            }
        }

        return null;
    }

    // delete blog
    public boolean deleteBlog(int id){
        int blogIndex = 1;
        for (Blog b:blogs){
            if (b.getId() == id){
                blogIndex = blogs.indexOf(b);
                continue;
            }
        }

        if (blogIndex > -1){
            blogs.remove(blogIndex);
        }

        return true;
    }

}
