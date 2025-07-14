<<<<<<< HEAD
"""
WSGI config for weatherproject project.

It exposes the WSGI callable as a module-level variable named ``application``.

For more information on this file, see
https://docs.djangoproject.com/en/5.2/howto/deployment/wsgi/
"""

import os

from django.core.wsgi import get_wsgi_application

os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'weatherproject.settings')

application = get_wsgi_application()
=======
"""
WSGI config for weatherproject project.

It exposes the WSGI callable as a module-level variable named ``application``.

For more information on this file, see
https://docs.djangoproject.com/en/5.2/howto/deployment/wsgi/
"""

import os

from django.core.wsgi import get_wsgi_application

os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'weatherproject.settings')

application = get_wsgi_application()
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
