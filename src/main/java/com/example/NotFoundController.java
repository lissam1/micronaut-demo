package com.example;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Error;
import io.micronaut.http.annotation.Produces;

@Controller
public class NotFoundController {

    @Error(status = HttpStatus.NOT_FOUND, global = true)
    @Produces(MediaType.TEXT_HTML)
    HttpResponse<String> notFound() {
        return HttpResponse.notFound(
                """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>404 Not Found</title>
                    <style>
                        body {
                            background: linear-gradient(135deg, #ffecd2 0%, #fcb69f 100%);
                            font-family: Arial, sans-serif;
                            color: #333;
                            margin: 0;
                            padding: 0;
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            height: 100vh;
                            text-align: center;
                        }
                        .container {
                            background: white;
                            padding: 40px;
                            border-radius: 20px;
                            box-shadow: 0 8px 20px rgba(0,0,0,0.15);
                            max-width: 600px;
                        }
                        h1 {
                            font-size: 3rem;
                            margin-bottom: 10px;
                        }
                        p {
                            font-size: 1.2rem;
                            margin: 10px 0 20px;
                        }
                        .emoji {
                            font-size: 4rem;
                        }
                        a {
                            display: inline-block;
                            margin-top: 20px;
                            padding: 12px 24px;
                            background: #ff6f61;
                            color: white;
                            text-decoration: none;
                            border-radius: 30px;
                            font-weight: bold;
                            transition: background 0.3s;
                        }
                        a:hover {
                            background: #e85c50;
                        }
                    </style>
                </head>
                <body>
                    <div class="container">
                        <div class="emoji">🚧😢🔍</div>
                        <h1>404 - Page Not Found</h1>
                        <p>Oops! The page you’re looking for doesn’t exist.<br>
                        It might have been moved, deleted, or never existed at all.</p>
                        <p>Don’t worry, you can always head back to safety! 🏠</p>
                        <a href="/">⬅ Go Home</a>
                    </div>
                </body>
                </html>
                """
        );
    }
}

