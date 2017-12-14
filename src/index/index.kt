package index

import kotlinext.js.invoke
import kotlinext.js.require
import kotlinx.html.InputType
import react.dom.*
import kotlin.browser.document

fun main(args: Array<String>) {
    require("src/index/index.css")
    require("src/app/App.css")
    require("src/logo/Logo.css")
    require("src/logo/kotlin.svg")

    render(document.getElementById("root")) {
        //        app()
        div("container") {
            nav("navbar navbar-expand-lg") {
                a(classes = "navbar-brand", href = "#") {
                    img(src = "logo.png") {
                        attrs.width = "30"
                        attrs.height = "30"
                    }
                }
            }
        }
        div("jumbotron") {
            div("row justify-content-md-center") {
                div("col-md-auto") {
                    img(src = "kotlinlibs.svg", classes = "logo") {
                        attrs.width = "369"
                        attrs.height = "60"
                    }
                    div("input-group input-group-lg") {
                        input(classes = "form-control") { }
                        span("input-group-btn") {
                            button(classes = "btn btn-primary") {
                                img(src = "ic_search_white_24px.svg") {}
                            }
                        }
                    }
                    div("btn-group center") {
                        label("btn btn-light center") {
                            input(InputType.radio, name = "platform") {}
                            +"JVM"
                        }
                        label("btn btn-light center") {
                            input(InputType.radio, name = "platform") {}
                            +"JS"
                        }
                        label("btn btn-light center") {
                            input(InputType.radio, name = "platform") {}
                            +"NATIVE"
                        }
                        label("btn btn-light center active") {
                            input(InputType.radio, name = "platform") {}
                            +"ALL"
                        }
                    }
                }
            }
        }
        div("container") {

        }
    }
}
