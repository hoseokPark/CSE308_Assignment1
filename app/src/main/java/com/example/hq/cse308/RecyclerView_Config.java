//package com.example.hq.cse308;
//
//import android.content.Context;
//import android.support.annotation.NonNull;
//import android.support.v7.widget.LinearLayoutManager;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import java.util.List;
//
//public class RecyclerView_Config {
//    private Context context;
//    private PostsAdapter postAdapter;
//
//    public void setConfig(RecyclerView recyclerView, Context context, List<Post> posts, List<String> keys) {
//        {
//            context = context;
//            postAdapter= new PostsAdapter(posts, keys);
//            recyclerView.setLayoutManager(new LinearLayoutManager(context));
//            recyclerView.setAdapter(postAdapter);
//        }
//    class PostItemView extends RecyclerView.ViewHolder {
//            private TextView name;
//            private TextView address;
//            private TextView phone;
//
//            private String key;
//
//            public PostItemView(ViewGroup parent) {
//                super(LayoutInflater.from(context).inflate(R.layout.post_list_item, parent, false));
//
//                name = (TextView) itemView.findViewById(R.id.nameField);
//                address = (TextView) itemView.findViewById(R.id.addressField);
//                phone = (TextView) itemView.findViewById(R.id.phoneField);
//            }
//
//            public void bind(Post post, String key) {
//                name.setText(post.getName());
//                address.setText(post.getAddress());
//                phone.setText(post.getPhone());
//                this.key = key;
//            }
//        }
//    class PostsAdapter extends RecyclerView.Adapter<PostItemView> {
//
//        private List<Post> PostList;
//        private List<String> Keys;
//
//        public PostsAdapter(List<Post> postList, List<String> keys) {
//            PostList = postList;
//            Keys = keys;
//        }
//
//        @Override
//        public PostItemView onCreateViewHolder(ViewGroup viewGroup, int i) {
//            return new PostItemView(viewGroup);
//        }
//
//        @Override
//        public void onBindViewHolder(@NonNull PostItemView postItemView, int i) {
//            postItemView.bind(PostList.get(i), Keys.get(i));
//        }
//
//        @Override
//        public int getItemCount() {
//            return PostList.size();
//        }
//    }
//    }
//}
