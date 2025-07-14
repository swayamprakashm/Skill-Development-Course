<<<<<<< HEAD
from django import forms
from .models import Task

class TaskForm(forms.ModelForm):
    class Meta:
        model = Task
        fields = ['title', 'completed']
=======
from django import forms
from .models import Task

class TaskForm(forms.ModelForm):
    class Meta:
        model = Task
        fields = ['title', 'completed']
>>>>>>> 10b5e9fbd590dd7b6eef73f6e5e409277d3db61f
