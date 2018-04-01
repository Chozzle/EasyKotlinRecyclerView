# EasyKotlinRecyclerView

An example implementation of a RecyclerView with multiple view types using Kotlin.

Kotlin's android extensions plugin now has experimental support for synthetic properties in View Holders. It makes it extremely easy to manage RecyclerViews since individual view holder implementations for each view type aren't required.

The app also uses the current best practice of using R.layout.ids as the view type to further simplify the Adapter down to just 6 lines of code!
```
class MyAdapter(val myData: MutableList<BaseItem>) : RecyclerView.Adapter<CachingViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, layoutResId: Int): CachingViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(layoutResId, parent, false)
        return CachingViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CachingViewHolder, position: Int) = myData[position].bind(holder, position)

    override fun getItemCount(): Int = myData.size

    override fun getItemViewType(position: Int): Int = myData[position].layoutID
}
```
[screenshot](readmeimages/screenshot.png)
