/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionsRequest extends AbstractModel {

    /**
    * <p>Feature name</p><p>Enumeration value:</p><ul><li>text2sql: Intelligent generation of retrieval analysis statement</li><li>text2sql-reasoning: Intelligent generation of retrieval analysis statement - deep thinking</li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>Chat context information.<br>Description:</p><ol><li>The maximum length is 11 (5 historical sessions + new user question), arranged in the array in chronological order from old to new. Session data beyond this length will be discarded.</li><li>Message.Role available values: user, assistant.<br>user and assistant must alternate, starting with a user question and ending with a user question. Content cannot be empty. Example of Role order: [user assistant user assistant user ...].</li></ol>
    */
    @SerializedName("Messages")
    @Expose
    private Message [] Messages;

    /**
    * <p>Streaming call switch.<br>Description:</p><ol><li>Defaults to non-streaming call (false) when no value is passed.</li><li>In streaming calls, results are incrementally returned via SSE protocol (return value is taken from Choices[n].Delta, and incremental data needs to be concatenated to obtain the complete result).</li><li>In non-streaming calls:<br>The calling method is the same as a regular HTTP request.<br>API response is time-consuming. If reduced latency is needed, set it to true.<br>Only the final result is returned once (return value is taken from Choices[n].Message).</li></ol><p>Note:</p><ol><li>When calling via SDK, streaming and non-streaming calls require different ways to obtain return values. Refer to comments or examples in the SDK (in the examples/cls/v20201016/ directory of each language SDK code repository).</li><li>Partial content may have been output, but if the FinishReason value in an intermediate response is "sensitive", it indicates the security review was not passed. If the business scenario requires real-time text display on the screen, manually withdraw the displayed content and customize a replacement reminder, such as "I can't answer this question. Let's try another topic", to ensure terminal experience.</li></ol>
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * <p>Additional metadata information. For example: [{"Key":"topic_id","Value":"xxxxxxxx-xxxx"},{"Key":"topic_region","Value":"ap-guangzhou"}]</p><p>It is recommended to transmit metadata information as per the example, otherwise it may cause inaccurate results. For example, in text2sql, not passing topic_id or topic_region will lead to unable to generate accurate query statements based on the log topic index.</p>
    */
    @SerializedName("Metadata")
    @Expose
    private MetadataItem [] Metadata;

    /**
     * Get <p>Feature name</p><p>Enumeration value:</p><ul><li>text2sql: Intelligent generation of retrieval analysis statement</li><li>text2sql-reasoning: Intelligent generation of retrieval analysis statement - deep thinking</li></ul> 
     * @return Model <p>Feature name</p><p>Enumeration value:</p><ul><li>text2sql: Intelligent generation of retrieval analysis statement</li><li>text2sql-reasoning: Intelligent generation of retrieval analysis statement - deep thinking</li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>Feature name</p><p>Enumeration value:</p><ul><li>text2sql: Intelligent generation of retrieval analysis statement</li><li>text2sql-reasoning: Intelligent generation of retrieval analysis statement - deep thinking</li></ul>
     * @param Model <p>Feature name</p><p>Enumeration value:</p><ul><li>text2sql: Intelligent generation of retrieval analysis statement</li><li>text2sql-reasoning: Intelligent generation of retrieval analysis statement - deep thinking</li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>Chat context information.<br>Description:</p><ol><li>The maximum length is 11 (5 historical sessions + new user question), arranged in the array in chronological order from old to new. Session data beyond this length will be discarded.</li><li>Message.Role available values: user, assistant.<br>user and assistant must alternate, starting with a user question and ending with a user question. Content cannot be empty. Example of Role order: [user assistant user assistant user ...].</li></ol> 
     * @return Messages <p>Chat context information.<br>Description:</p><ol><li>The maximum length is 11 (5 historical sessions + new user question), arranged in the array in chronological order from old to new. Session data beyond this length will be discarded.</li><li>Message.Role available values: user, assistant.<br>user and assistant must alternate, starting with a user question and ending with a user question. Content cannot be empty. Example of Role order: [user assistant user assistant user ...].</li></ol>
     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set <p>Chat context information.<br>Description:</p><ol><li>The maximum length is 11 (5 historical sessions + new user question), arranged in the array in chronological order from old to new. Session data beyond this length will be discarded.</li><li>Message.Role available values: user, assistant.<br>user and assistant must alternate, starting with a user question and ending with a user question. Content cannot be empty. Example of Role order: [user assistant user assistant user ...].</li></ol>
     * @param Messages <p>Chat context information.<br>Description:</p><ol><li>The maximum length is 11 (5 historical sessions + new user question), arranged in the array in chronological order from old to new. Session data beyond this length will be discarded.</li><li>Message.Role available values: user, assistant.<br>user and assistant must alternate, starting with a user question and ending with a user question. Content cannot be empty. Example of Role order: [user assistant user assistant user ...].</li></ol>
     */
    public void setMessages(Message [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get <p>Streaming call switch.<br>Description:</p><ol><li>Defaults to non-streaming call (false) when no value is passed.</li><li>In streaming calls, results are incrementally returned via SSE protocol (return value is taken from Choices[n].Delta, and incremental data needs to be concatenated to obtain the complete result).</li><li>In non-streaming calls:<br>The calling method is the same as a regular HTTP request.<br>API response is time-consuming. If reduced latency is needed, set it to true.<br>Only the final result is returned once (return value is taken from Choices[n].Message).</li></ol><p>Note:</p><ol><li>When calling via SDK, streaming and non-streaming calls require different ways to obtain return values. Refer to comments or examples in the SDK (in the examples/cls/v20201016/ directory of each language SDK code repository).</li><li>Partial content may have been output, but if the FinishReason value in an intermediate response is "sensitive", it indicates the security review was not passed. If the business scenario requires real-time text display on the screen, manually withdraw the displayed content and customize a replacement reminder, such as "I can't answer this question. Let's try another topic", to ensure terminal experience.</li></ol> 
     * @return Stream <p>Streaming call switch.<br>Description:</p><ol><li>Defaults to non-streaming call (false) when no value is passed.</li><li>In streaming calls, results are incrementally returned via SSE protocol (return value is taken from Choices[n].Delta, and incremental data needs to be concatenated to obtain the complete result).</li><li>In non-streaming calls:<br>The calling method is the same as a regular HTTP request.<br>API response is time-consuming. If reduced latency is needed, set it to true.<br>Only the final result is returned once (return value is taken from Choices[n].Message).</li></ol><p>Note:</p><ol><li>When calling via SDK, streaming and non-streaming calls require different ways to obtain return values. Refer to comments or examples in the SDK (in the examples/cls/v20201016/ directory of each language SDK code repository).</li><li>Partial content may have been output, but if the FinishReason value in an intermediate response is "sensitive", it indicates the security review was not passed. If the business scenario requires real-time text display on the screen, manually withdraw the displayed content and customize a replacement reminder, such as "I can't answer this question. Let's try another topic", to ensure terminal experience.</li></ol>
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set <p>Streaming call switch.<br>Description:</p><ol><li>Defaults to non-streaming call (false) when no value is passed.</li><li>In streaming calls, results are incrementally returned via SSE protocol (return value is taken from Choices[n].Delta, and incremental data needs to be concatenated to obtain the complete result).</li><li>In non-streaming calls:<br>The calling method is the same as a regular HTTP request.<br>API response is time-consuming. If reduced latency is needed, set it to true.<br>Only the final result is returned once (return value is taken from Choices[n].Message).</li></ol><p>Note:</p><ol><li>When calling via SDK, streaming and non-streaming calls require different ways to obtain return values. Refer to comments or examples in the SDK (in the examples/cls/v20201016/ directory of each language SDK code repository).</li><li>Partial content may have been output, but if the FinishReason value in an intermediate response is "sensitive", it indicates the security review was not passed. If the business scenario requires real-time text display on the screen, manually withdraw the displayed content and customize a replacement reminder, such as "I can't answer this question. Let's try another topic", to ensure terminal experience.</li></ol>
     * @param Stream <p>Streaming call switch.<br>Description:</p><ol><li>Defaults to non-streaming call (false) when no value is passed.</li><li>In streaming calls, results are incrementally returned via SSE protocol (return value is taken from Choices[n].Delta, and incremental data needs to be concatenated to obtain the complete result).</li><li>In non-streaming calls:<br>The calling method is the same as a regular HTTP request.<br>API response is time-consuming. If reduced latency is needed, set it to true.<br>Only the final result is returned once (return value is taken from Choices[n].Message).</li></ol><p>Note:</p><ol><li>When calling via SDK, streaming and non-streaming calls require different ways to obtain return values. Refer to comments or examples in the SDK (in the examples/cls/v20201016/ directory of each language SDK code repository).</li><li>Partial content may have been output, but if the FinishReason value in an intermediate response is "sensitive", it indicates the security review was not passed. If the business scenario requires real-time text display on the screen, manually withdraw the displayed content and customize a replacement reminder, such as "I can't answer this question. Let's try another topic", to ensure terminal experience.</li></ol>
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get <p>Additional metadata information. For example: [{"Key":"topic_id","Value":"xxxxxxxx-xxxx"},{"Key":"topic_region","Value":"ap-guangzhou"}]</p><p>It is recommended to transmit metadata information as per the example, otherwise it may cause inaccurate results. For example, in text2sql, not passing topic_id or topic_region will lead to unable to generate accurate query statements based on the log topic index.</p> 
     * @return Metadata <p>Additional metadata information. For example: [{"Key":"topic_id","Value":"xxxxxxxx-xxxx"},{"Key":"topic_region","Value":"ap-guangzhou"}]</p><p>It is recommended to transmit metadata information as per the example, otherwise it may cause inaccurate results. For example, in text2sql, not passing topic_id or topic_region will lead to unable to generate accurate query statements based on the log topic index.</p>
     */
    public MetadataItem [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>Additional metadata information. For example: [{"Key":"topic_id","Value":"xxxxxxxx-xxxx"},{"Key":"topic_region","Value":"ap-guangzhou"}]</p><p>It is recommended to transmit metadata information as per the example, otherwise it may cause inaccurate results. For example, in text2sql, not passing topic_id or topic_region will lead to unable to generate accurate query statements based on the log topic index.</p>
     * @param Metadata <p>Additional metadata information. For example: [{"Key":"topic_id","Value":"xxxxxxxx-xxxx"},{"Key":"topic_region","Value":"ap-guangzhou"}]</p><p>It is recommended to transmit metadata information as per the example, otherwise it may cause inaccurate results. For example, in text2sql, not passing topic_id or topic_region will lead to unable to generate accurate query statements based on the log topic index.</p>
     */
    public void setMetadata(MetadataItem [] Metadata) {
        this.Metadata = Metadata;
    }

    public ChatCompletionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatCompletionsRequest(ChatCompletionsRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Messages != null) {
            this.Messages = new Message[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new Message(source.Messages[i]);
            }
        }
        if (source.Stream != null) {
            this.Stream = new Boolean(source.Stream);
        }
        if (source.Metadata != null) {
            this.Metadata = new MetadataItem[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new MetadataItem(source.Metadata[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);

    }
}

