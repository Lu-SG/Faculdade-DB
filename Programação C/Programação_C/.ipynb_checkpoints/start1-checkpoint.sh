docker run -u root --rm -e GRANT_SUDO=yes -e NB_GID=100 -p 8888:8888 -e JUPYTER_ENABLE_LAB=yes -v "$PWD":/home/jovyan/work jupyter/datascience-notebook start-notebook.sh --NotebookApp.token='python'
