# someapp

An app demonstrating using milieu inside Immutant.

The milieu environment is controlled by the lein profile (see `project.clj`). 
To set the environment at deploy time, set the proper profile:

    lein immutant deploy --lein-profiles prod
    
