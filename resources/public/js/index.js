var React = require('react');
var ReactDOM = require('react-dom');
var $ = require('jquery');

var App = React.createClass({
    getInitialState: function() {
        return {
            dots: [
                [1, 1], [2, 1], [2, 2], [1, 2],
                [10, 1], [11, 1], [11, 2], [10, 2],
                [1, 10], [2, 10], [2, 11], [1, 11],
                [10, 10], [11, 10], [11, 11], [10, 11]                
            ]
        }
    },
    render: function() {
        return (
            <canvas id="app">
            </canvas>
        )
    }
});

$(document).ready(function() {
    ReactDOM.render(
        <App />,
        $('#container')[0]
    )
});
