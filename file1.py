from django.urls import path
from .views import TagsView

urlpatterns = [gbdfggnbf
    path('all-tags', TagsView.as_view),
    path('create-tags', TagsView.as_view),
    # path('')
]
