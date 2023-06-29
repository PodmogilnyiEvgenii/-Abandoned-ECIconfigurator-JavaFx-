package com.home.eciconfigurator.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.home.eciconfigurator.dto.Device;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonUtils {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String getRequestString() {
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("type", "get");
        return objectNode.toString();
    }

    public static Boolean isValidJsonString(String jsonString) {
        try {
            objectMapper.readTree(jsonString);
            return true;
        } catch (JsonProcessingException e) {
            //log.error("Invalid JSON: {}", e.toString());
        }
        return false;
    }

    public static Device getDeviceFromJson(String jsonString) {
        Device newDevice = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            newDevice = objectMapper.readValue(jsonString, Device.class);
        } catch (JsonProcessingException e) {
            //log.error("Device parse from JSON error: {}", e.toString());
        }
        return newDevice;
    }

    public static String getJsonFromDevice(Device device) {
        try {
            ObjectWriter objectWriter = new ObjectMapper().writer();
            return objectWriter.writeValueAsString(device);
        } catch (JsonProcessingException e) {
            log.error("JSON parse from Device error: {}", e.toString());
        }
        return null;
    }
}
