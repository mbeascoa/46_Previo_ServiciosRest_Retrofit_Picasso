package com.example.a46_previo_serviciosrest_retrofit_picasso;

public class CarsAdapterextends RecyclerView.Adapter<CarsAdapter.ViewHolder> {
        private ArrayList<CarsModel>carsModels= new ArrayList<>();
        private Context context;

    public CarsAdapter(Context context, ArrayList<CarsModel>carsModels){
                this.carsModels= carsModels;
                this.context= context;
            }

    @NonNull
    @Override
    public CarsAdapter.ViewHolderonCreateViewHolder(@NonNull ViewGroupviewGroup, int viewType) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.car_list_item, viewGroup,false);
            return new CarsAdapter.ViewHolder(view);
            }

    @Override
    public void onBindViewHolder(@NonNull CarsAdapter.ViewHolderviewHolder, int i) {
            viewHolder.car_name.setText(carsModels.get(i).getName());
            viewHolder.car_description.setText(carsModels.get(i).getDesc());
            Picasso.get().load(carsModels.get(i).getImage()).into(viewHolder.car_image);
            }

    @Override
    public int getItemCount() {
        return carsModels.size();
        }

    public class ViewHolderextends RecyclerView.ViewHolder {
            private ImageViewcar_image;
            private TextViewcar_name;
            private TextViewcar_description;
            public ViewHolder(@NonNull View itemView) {
            super(itemView);
            car_image=itemView.findViewById(R.id.car_image);
            car_name=itemView.findViewById(R.id.car_name);
            car_description=itemView.findViewById(R.id.car_description);
            }
        }
}