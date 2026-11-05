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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeRunDetail extends AbstractModel {

    /**
    * <p>Node running information</p>
    */
    @SerializedName("NodeRun")
    @Expose
    private NodeRun NodeRun;

    /**
    * <p>Node operation content.</p>
    */
    @SerializedName("NodeRunContent")
    @Expose
    private NodeRunContent NodeRunContent;

    /**
    * <p>Node operation process</p>
    */
    @SerializedName("NodeRunExecution")
    @Expose
    private NodeRunExecution NodeRunExecution;

    /**
    * <p>Node operation logs</p>
    */
    @SerializedName("NodeRunLog")
    @Expose
    private NodeRunLog NodeRunLog;

    /**
    * <p>Statistical information.</p>
    */
    @SerializedName("StatisticList")
    @Expose
    private Statistic [] StatisticList;

    /**
     * Get <p>Node running information</p> 
     * @return NodeRun <p>Node running information</p>
     */
    public NodeRun getNodeRun() {
        return this.NodeRun;
    }

    /**
     * Set <p>Node running information</p>
     * @param NodeRun <p>Node running information</p>
     */
    public void setNodeRun(NodeRun NodeRun) {
        this.NodeRun = NodeRun;
    }

    /**
     * Get <p>Node operation content.</p> 
     * @return NodeRunContent <p>Node operation content.</p>
     */
    public NodeRunContent getNodeRunContent() {
        return this.NodeRunContent;
    }

    /**
     * Set <p>Node operation content.</p>
     * @param NodeRunContent <p>Node operation content.</p>
     */
    public void setNodeRunContent(NodeRunContent NodeRunContent) {
        this.NodeRunContent = NodeRunContent;
    }

    /**
     * Get <p>Node operation process</p> 
     * @return NodeRunExecution <p>Node operation process</p>
     */
    public NodeRunExecution getNodeRunExecution() {
        return this.NodeRunExecution;
    }

    /**
     * Set <p>Node operation process</p>
     * @param NodeRunExecution <p>Node operation process</p>
     */
    public void setNodeRunExecution(NodeRunExecution NodeRunExecution) {
        this.NodeRunExecution = NodeRunExecution;
    }

    /**
     * Get <p>Node operation logs</p> 
     * @return NodeRunLog <p>Node operation logs</p>
     */
    public NodeRunLog getNodeRunLog() {
        return this.NodeRunLog;
    }

    /**
     * Set <p>Node operation logs</p>
     * @param NodeRunLog <p>Node operation logs</p>
     */
    public void setNodeRunLog(NodeRunLog NodeRunLog) {
        this.NodeRunLog = NodeRunLog;
    }

    /**
     * Get <p>Statistical information.</p> 
     * @return StatisticList <p>Statistical information.</p>
     */
    public Statistic [] getStatisticList() {
        return this.StatisticList;
    }

    /**
     * Set <p>Statistical information.</p>
     * @param StatisticList <p>Statistical information.</p>
     */
    public void setStatisticList(Statistic [] StatisticList) {
        this.StatisticList = StatisticList;
    }

    public NodeRunDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeRunDetail(NodeRunDetail source) {
        if (source.NodeRun != null) {
            this.NodeRun = new NodeRun(source.NodeRun);
        }
        if (source.NodeRunContent != null) {
            this.NodeRunContent = new NodeRunContent(source.NodeRunContent);
        }
        if (source.NodeRunExecution != null) {
            this.NodeRunExecution = new NodeRunExecution(source.NodeRunExecution);
        }
        if (source.NodeRunLog != null) {
            this.NodeRunLog = new NodeRunLog(source.NodeRunLog);
        }
        if (source.StatisticList != null) {
            this.StatisticList = new Statistic[source.StatisticList.length];
            for (int i = 0; i < source.StatisticList.length; i++) {
                this.StatisticList[i] = new Statistic(source.StatisticList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "NodeRun.", this.NodeRun);
        this.setParamObj(map, prefix + "NodeRunContent.", this.NodeRunContent);
        this.setParamObj(map, prefix + "NodeRunExecution.", this.NodeRunExecution);
        this.setParamObj(map, prefix + "NodeRunLog.", this.NodeRunLog);
        this.setParamArrayObj(map, prefix + "StatisticList.", this.StatisticList);

    }
}

