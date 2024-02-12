nrepl:
	clj -M:nrepl -m nrepl.cmdline --middleware "[cider.nrepl/cider-middleware]"

ui-watch:
	npx parcel public/index.html
