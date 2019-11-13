# Execute via Git Bash: 
# 	chmod +x skip-worktree.sh
# 	./skip-worktree.sh
# Check which files are skipped: 
# 	git ls-files -v . | grep ^h
# OR
# 	git ls-files -v . | grep ^S

git update-index --skip-worktree it.unibo.eclipse.qak.planning19/.classpath
git update-index --skip-worktree it.unibo.jcc.sprint3/.classpath
git update-index --skip-worktree it.unibo.jcc.sprint3/.project
git update-index --skip-worktree it.unibo.robotmind/.classpath
git update-index --skip-worktree it.unibo.workinroom/.classpath
git update-index --skip-worktree it.unibo.workinroom/.project