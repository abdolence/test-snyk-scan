CURRENT_DIR=$(pwd)

docker run --name snyksnykscala_53819b --workdir /github/workspace --rm -e "SNYK_TOKEN" -e "GITHUB_TOKEN" -e GITHUB_ACTIONS=true -e CI=true -v "/tmp/_temp/_github_home":"/github/home" -v "/tmp/_temp/_github_workflow":"/github/workflow" -v "/tmp/_temp/_runner_file_commands":"/github/file_commands" -v "$CURRENT_DIR":"/github/workspace" snyk/snyk:scala  "snyk" "test" "--all-projects" "--org=team-platform" "-d" > debug_output.log 2>&1
