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

    @PostMapping("/comment/insert")
    public void insertCity(@RequestBody TicketappComment comment) {
        commentService.insert(comment);
    }

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getById(@PathVariable("id") int id){
        return ResponseEntity.ok(commentService.findById(id));
    }

    @RequestMapping(value = "/comment/list", method = RequestMethod.GET)
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
