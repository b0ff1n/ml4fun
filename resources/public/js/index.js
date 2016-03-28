var React = require('react');
var ReactDOM = require('react-dom');
var $ = require('jquery');

var App = React.createClass({
    render: function() {
        return (
            <div id="app">
                here is the app
            </div>
        )
    }
});

$(document).ready(function() {
    ReactDOM.render(
        <App />,
        $('#container')[0]
    )
});
