import React from "react";
import ReactDOM from "react-dom";
import { data, totalTrackLength } from "./sampleData";
import "./styles.css";

// assume all data is valid and sorted by start time
const TimelineSegments = ({ data, totalTrackLength }) => {
  return <div className="container">segments go here</div>;
};

// boilerplate
ReactDOM.render(
  <TimelineSegments data={data} totalTrackLength={totalTrackLength} />,
  document.getElementById("root")
);
