<!doctype html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="João Pedro S. Bertoletti, Sophia, Jean Garra, Gustavo">
    <title>JS-Opinião sobre Acessibilidade</title>
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/album/">
    <!-- Bootstrap core CSS -->
    <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      body{
        background-color: #FFE4E1;
      }
      
      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
  </head>
  <body>
    
<header>
  <div class="navbar navbar-light " style="background-color: #EEE8AA;">
    <div class="container">
      <a href="index.jsp" class="navbar-brand d-flex align-items-center">
        <strong style="color: black;">Inicio</strong>
      </a>
      <a href="index_sug.jsp" class="navbar-brand d-flex align-items-center">
        <strong style="color: black;">Sugestão</strong>
      </a>
     
    </div>
  </div>
</header>

<main>

  <section class="py-5 text-center container">
    <div class="row py-lg-5">
      <div class="col-lg-6 col-md-8 mx-auto">
        <h1 class="fw-light">Listas dos Aplicativos para Android e IOS.</h1>
        <p class="lead text-muted">Abaixo você pode conferir três lista dos aplicativos de Android e IOS mais recomendados e que oferecem o melhor suporte para deficientes visuais.</p>
      </div>
    </div>
  </section>

  <div class="album py-5 bg-light">
    <div class="container">

      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
        <div class="col">
          <div class="card shadow-sm">
            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%" fill="#772328"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Aplicativos IOS</text></svg>

            <div class="card-body">
              <p class="card-text">Aplicativos IOS para Deficientes Visuais.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                  <a href="index_ios.jsp"><button type="button" class="btn btn-sm btn-outline-secondary">Visualizar</button></a>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card shadow-sm">
            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%" fill="#AC3030"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Aplicativos Android</text></svg>

            <div class="card-body">
              <p class="card-text">Aplicativos Android para Deficientes Visuais.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                 <a href="index_android.jsp"><button type="button" class="btn btn-sm btn-outline-secondary">Visualizar</button></a>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="col">
          <div class="card shadow-sm">
            <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><rect width="100%" height="100%" fill="#DD3E3B"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Aplicativos Android e IOS</text></svg>

            <div class="card-body">
              <p class="card-text">Aplicativos Android e IOS para Deficientes Visuais.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                  <a href="index_ios_android.jsp"><button type="button" class="btn btn-sm btn-outline-secondary">Visualizar</button></a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

</main>

<footer class="text-muted py-5">
  <div class="container">
    <p class="float-end mb-1">
      <a href="#" style="text-decoration: none; color: black;">Back to top</a>
    </p>
    <p class="mb-1"> Trabalho feito por João Pedro S. Bertoletti, Sophia, Jean Garra e Gustavo.</p>
  </div>
</footer>

    <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>

      
  </body>
</html>
