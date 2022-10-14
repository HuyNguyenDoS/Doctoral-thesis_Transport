package doan.backend.transport.controller;

import doan.backend.transport.entity.TicketappComment;
import doan.backend.transport.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/busroutes/comment/{routeID}", method = RequestMethod.GET)
    public ResponseEntity<?> findCommentOfRoute(@PathVariable int routeID){
        List<TicketappComment> list = commentService.findCommentOfRoute(routeID);
        return ResponseEntity.ok(list);
    }

    @RequestMapping(value = "/busroutes/last-comment", method = RequestMethod.GET)
    public ResponseEntity<?> findCommentOfRoute(){
        List<TicketappComment> list = commentService.findLastComment();
        return ResponseEntity.ok(list);
    }

    @PostMapping("/comment/insert")
    public void insertCity(@RequestBody TicketappComment comment) {
        commentService.insert(comment);
    }

    @RequestMapping(value = "/comments/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getById(@PathVariable("id") int id){
        return ResponseEntity.ok(commentService.findById(id));
    }

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    public ResponseEntity<?> getList(){
        List<TicketappComment> getList = commentService.getList();
        return ResponseEntity.ok(getList);
    }

    @PutMapping("/comment/update")
    public void update(@RequestBody TicketappComment comment) {
        commentService.update(comment);
    }

    @DeleteMapping("/comment/delete/{id}")
    public void delete(@PathVariable int id) {
        commentService.delete(id);
    }
}
