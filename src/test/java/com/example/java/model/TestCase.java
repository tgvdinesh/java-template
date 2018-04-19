package com.example.java.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "input",
        "output"
})
public class TestCase {

    @JsonProperty("input")
    private String input;
    @JsonProperty("output")
    private String output;

    /**
     * No args constructor for use in serialization
     */
    public TestCase() {
    }

    /**
     * @param input  Input which has to be feed to algorithm
     * @param output output that is expected to be received from algorithm
     */
    public TestCase(String input, String output) {
        super();
        this.input = input;
        this.output = output;
    }

    @JsonProperty("input")
    public String getInput() {
        return input;
    }

    @JsonProperty("input")
    public void setInput(String input) {
        this.input = input;
    }

    @JsonProperty("output")
    public String getOutput() {
        return output;
    }

    @JsonProperty("output")
    public void setOutput(String output) {
        this.output = output;
    }

    @Override
    public String toString() {
        return "TestCase{" +
                "input='" + input + '\'' +
                ", output='" + output + '\'' +
                '}';
    }
}