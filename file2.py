FROM python:3.10-slim
WORKDIR /app
COPY requirements.txt .
RUN apt-get update && apt-get install -y \
    portaudio19-dev \
    python3-dev \
    build-essential \
    libpq-dev \
    libssl-dev
RUN pip install --no-cache-dir --verbose -r requirements.txt
RUN apt update -y && apt install -y libmagic-dev
COPY . .
EXPOSE 8000
CMD ["python", "manage.py", "runserver", "0.0.0.0:8000"]
