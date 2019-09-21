Rails.application.routes.draw do
  root 'static_pages#welcome'
  get '/about-us', to: 'static_pages#aboutus', as: 'aboutus'
  get '/my-report', to: 'static_pages#myreport', as: 'myreport'

end


