FROM mcr.microsoft.com/dotnet/sdk:7.0

COPY . /appnet
WORKDIR /appnet

RUN dotnet build

CMD ["dotnet", "run"]
