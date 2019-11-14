package itunibo.jcc.coap.butlermind.test

import it.unibo.kactor.ActorBasic
import javax.swing.JButton
import javax.swing.JFrame
import java.awt.event.ActionListener
import java.awt.event.ActionEvent
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.awt.FlowLayout
import javax.swing.BoxLayout
import javax.swing.JPanel

object commandGui : ActionListener {
	
	
	override fun actionPerformed(e: ActionEvent?) {
		val cmd = e!!.getActionCommand()
		when (cmd) {
			"STOP" -> {
				GlobalScope.launch { actor.autoMsg("stop", "stop") }
			}
			"REACTIVATE" -> {
				GlobalScope.launch { actor.autoMsg("reactivate", "reactivate") }
			}
			"PREPARE" -> {
				GlobalScope.launch { actor.autoMsg("prepare", "prepare") }
			}
			"CLEAR" -> {
				GlobalScope.launch { actor.autoMsg("clear", "clear") }
			}
		}
	}

	lateinit var actor: ActorBasic
	
	fun createButton(container: JPanel, command: String) {
		val btn = JButton()
		btn.text = command
		btn.actionCommand = command
		btn.addActionListener(this)
		container.add(btn)
	}
	
	fun create(actor: ActorBasic) {
		
		this.actor = actor
		
		val frame = JFrame()
		val panel = JPanel()
		panel.setLayout(FlowLayout())
		
		createButton(panel, "STOP")
		createButton(panel, "REACTIVATE")
		createButton(panel, "PREPARE")
		createButton(panel, "CLEAR")
		
		frame.add(panel)
		
		frame.pack()
		frame.setLocationRelativeTo(null)
		frame.setAlwaysOnTop(true)
		frame.setVisible(true)
		
	}
}