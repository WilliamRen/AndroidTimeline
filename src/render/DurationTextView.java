package render;

import android.content.Context;
import model.Duration;

/**
 * @author josh
 * 
 */
public class DurationTextView extends TLEventTextView {

	/**
	 * The width in pixels of the label
	 */
	private int width;
	
	/**
	 * This should never be called.
	 * 
	 * @param context
	 */
	public DurationTextView(Context context){
		super(context, 0, 0, null);
	}

	/**
	 * Constructor calls the super constructor with the event name, assigns
	 * instance variables, and then calls init
	 * 
	 * @param event
	 *            the event this label is associated with
	 * @param xPos
	 *            the xPosition on the screen
	 * @param yPos
	 *            the yPosition on the screen
	 * @param width
	 *            the width of the label
	 * @param model
	 *            the program model
	 * @param eventLabels
	 *            the list of TLEventLabels
	 */
	public DurationTextView(Context context, Duration event, int xPos, int yPos, int width) {
		super(context, xPos, yPos, event);
		this.width = width;
		uniqueDesign(); // yeah this is kludgy
	}

	@Override
	public void uniqueHandlers() {
	}

	@Override
	public void uniqueDesign() {
		setWidth(width);
		//setId("duration-label"); TODO DURATION DESIGN
	}

}
