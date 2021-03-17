# Setup PostgreSQL

1. Install [**Docker Desktop for Windows**](https://docs.docker.com/docker-for-windows/install/) or [**Docker Desktop for Mac**](https://docs.docker.com/docker-for-mac/install/).

2. Create the subdirectory `databases/postgres` in your home directory.

   - Not sure about your home directory? Execute following command in _PowerShell_ or _Mac Terminal_:

     ```powershell
     echo $HOME
     ```

3. Execute following command in _PowerShell_ or _Mac Terminal_:

   ``` powershell
   docker run --restart unless-stopped --name postgres -e POSTGRES_PASSWORD=postgres -d -p 127.0.0.1:5432:5432 -v $HOME/databases/postgres:/var/lib/postgresql/data postgres
   ```

   **Important:** On Mac you should prefix the command with `sudo`.

