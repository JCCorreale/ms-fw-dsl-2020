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

object suspendResumeGui : ActionListener {
	
	
	override fun actionPerformed(e: ActionEvent?) {
		val cmd = e!!.getActionCommand()
		when (cmd) {
			"STOP" -> {
				GlobalScope.launch { actor.autoMsg("stop", "stop") }
			}
			"REACTIVATE" -> {
				GlobalScope.launch { actor.autoMsg("reactivate", "reactivate") }
			}
		}
	}

	lateinit var actor: ActorBasic
	
	fun create(actor: ActorBasic) {
		
		this.actor = actor
		
		val frame = JFrame()
		val panel = JPanel()
		
		val suspendBtn = JButton()
		val resumeBtn = JButton()
		suspendBtn.text = "STOP"
		resumeBtn.text = "REACTIVATE"
		suspendBtn.setActionCommand("STOP")
		resumeBtn.setActionCommand("REACTIVATE")
		
		suspendBtn.addActionListener(this)
		resumeBtn.addActionListener(this)
		
		panel.setLayout(FlowLayout())
		panel.add(suspendBtn)
		panel.add(resumeBtn)
		
		frame.add(panel)
		
		frame.pack()
		frame.setVisible(true)
	}
}