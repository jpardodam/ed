using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{
	public MainWindow () : base (Gtk.WindowType.Toplevel)
	{
//		Build ();
//		for (int index = 0; index < 10; index++) {
//			Button button = new Button ();
//			button.Label = (index + 1).ToString ();
//			button.Visible = true;
//			uint row = (uint)(index / 10);
//			uint column = (uint)(index % 10);
//			table.Attach (button, (uint)index, (uint)(index + 1), 0, 1);
//		}
//
		for (uint row = 0; row <9; row++)
			
		table.Visible = true;
		VBoxMain.Add (table);
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
		Application.Quit ();
		a.RetVal = true;
	}
}
