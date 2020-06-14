package com.indi.indicallloger
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.contacts_view.view.*

class ContactsAdapter(
    val contactsList:ArrayList<Contacts>): RecyclerView.Adapter<ContactsAdapter.ViewHolder>(){
    override fun getItemCount(): Int {
        return contactsList.size
    }

    override fun onBindViewHolder(holder: ContactsAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactsList[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contacts_view,parent,false)
        return ViewHolder(view)
    }

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        private var contacts: Contacts? = null
        var currentPosition: Int = 0

        init{
            itemView.setOnClickListener{

            }
            itemView.imgCall.setOnClickListener {
          /*      contacts?.let{
                    var message: String = this.contacts!!.phonenumber

                    val intent1 = Intent(Intent.ACTION_CALL)
                    intent1.data = Uri.parse("tel:" +message)
                    context.startActivity(intent1)


                }*/
            }
        }
}


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItem(contacts: Contacts) {
            val textName = itemView.findViewById<AppCompatTextView>(R.id.contactname_txv)
            val textPhonenumber = itemView.findViewById<AppCompatTextView>(R.id.contactnumber_txv)
            textName.text = contacts.name
            textPhonenumber.text = contacts.phonenumber
    }


}
}
