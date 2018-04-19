// Publish to my Bintray repository.
publishMavenStyle := false
bintrayPackageLabels := Seq("sbt","plugin")
bintrayVcsUrl := Some("""git@github.com:crossroad0201/sbt-aws-serverless.git""")
bintrayRepository := "sbt-plugins"
bintrayOrganization in bintray := None
licenses += ("MIT", url("https://opensource.org/licenses/mit-license.php"))
