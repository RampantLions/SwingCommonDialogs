/* @(#)LoginView.java	1.00 Jul 17, 2014
 *
 * Copyright (c) 2014, RampantLions and/or its affiliates. All rights reserved.
 */

package io.github.rampantlions.swing.commondialogs.login;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * ## Class <code>LoginView</code>.
 * 
 * ### Example
 * ```java
 * LoginView.show();
 * LoginView.waitUntilClosed();
 * String username = LoginView.getUser();
 * String password = LoginView.getPassword(); 
 * ```
 * 
 * > Note the values can only be retrieved once before the LoginView object "forgets" the credentials.
 * 
 * ![Login Process](loginProcess.png)
 *
 * @author <a href="josh.wiechman@gmail.com">Wiechman, Joshua</a>
 * @version 1.00, Jul 17, 2014
 * @startuml loginProcess.png
 * 
 * [*] --> LoginForm
 * LoginForm --> UserInput
 * UserInput --> LoginForm
 * @enduml 
 */
public class LoginView
{

	/** The password text. */
	protected static JPasswordField passwordText;

	/** The user text. */
	protected static JTextField userText;

	/** The frame. */
	protected static JFrame frame;

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	@SuppressWarnings( "deprecation" )
	public static String getPassword()
	{
		String returnvalue = LoginView.passwordText.getText();
		LoginView.passwordText.setText( null );
		return returnvalue;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public static String getUser()
	{
		String returnvalue = LoginView.userText.getText();
		LoginView.userText.setText( null );
		return returnvalue;
	}

	/**
	 * Checks if is open.
	 *
	 * @return true, if is open
	 */
	public static boolean isOpen()
	{
		for ( Window w : Window.getWindows() )
		{
			if ( w.isShowing() )
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	@SuppressWarnings( "unused" )
	public static void main( String[] args )
	{
		LoginView.show();
		LoginView.waitUntilClosed();
		String username = LoginView.getUser();
		String password = LoginView.getPassword();
	}

	/**
	 * Place components.
	 *
	 * @param panel the panel
	 */
	private static void placeComponents( final JPanel panel )
	{
		panel.setLayout( null );
		JLabel userLabel = new JLabel( "Username" );
		userLabel.setBounds( 10, 10, 80, 25 );
		panel.add( userLabel );
		LoginView.userText = new JTextField( 20 );
		LoginView.userText.setBounds( 100, 10, 160, 25 );
		LoginView.userText.setText( System.getProperty( "user.name" ) );
		panel.add( LoginView.userText );
		JLabel passwordLabel = new JLabel( "Password" );
		passwordLabel.setBounds( 10, 40, 80, 25 );
		panel.add( passwordLabel );
		LoginView.passwordText = new JPasswordField( 20 );
		LoginView.passwordText.setBounds( 100, 40, 160, 25 );
		panel.add( LoginView.passwordText );
		JButton authenticateButton = new JButton( "authenticate" );
		authenticateButton.setBounds( 10, 80, 160, 25 );
		panel.add( authenticateButton );
		authenticateButton.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed( final ActionEvent e )
			{
				LoginView.frame.dispose();
			}
		} );
		LoginView.frame.getRootPane().setDefaultButton( authenticateButton );
	}

	/**
	 * Show.
	 */
	public static void show()
	{
		try
		{
			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
		}
		catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e )
		{
			e.printStackTrace();
		}

		LoginView.frame = new JFrame( "Corp/NT Login" );
		LoginView.frame.setSize( 300, 150 );
		LoginView.frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		JPanel panel = new JPanel();
		LoginView.frame.add( panel );
		LoginView.placeComponents( panel );
		LoginView.frame.setVisible( true );
		LoginView.passwordText.requestFocus();
	}

	/**
	 * Wait until closed.
	 */
	public static void waitUntilClosed()
	{
		while ( LoginView.isOpen() )
		{
			try
			{
				Thread.sleep( 200 );
			}
			catch ( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
	}
}
