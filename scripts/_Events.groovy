eventWarStart = { type ->
	def env = System.getenv()
	def current = metadata['app.version']
	println "Current app.version: ${current}"

	current += '.' + (env['BUILD_NUMBER'] ?: 'MANUAL')
	current += '.' + (env['SVN_REVISION'] ?: '0')

	if (current != metadata['app.version']) {
		println "Updating app.version with build and SVN numbers: ${current}"
		metadata['app.version'] = current
	}	
}