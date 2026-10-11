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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileNode extends AbstractModel {

    /**
    * <p>Current node</p>
    */
    @SerializedName("Node")
    @Expose
    private FileMeta Node;

    /**
    * <p>Parent node</p>
    */
    @SerializedName("Parent")
    @Expose
    private FileMeta Parent;

    /**
    * <p>Creator</p>
    */
    @SerializedName("Creator")
    @Expose
    private UserInfo Creator;

    /**
    * <p>Owner</p>
    */
    @SerializedName("Owner")
    @Expose
    private UserInfo Owner;

    /**
    * <p>Node type.</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>Original path</p>
    */
    @SerializedName("OriginPath")
    @Expose
    private String OriginPath;

    /**
    * <p>Recycle time</p>
    */
    @SerializedName("DeleteTime")
    @Expose
    private String DeleteTime;

    /**
    * <p>File git configuration.</p>
    */
    @SerializedName("GitConfig")
    @Expose
    private GitRepoConfig GitConfig;

    /**
     * Get <p>Current node</p> 
     * @return Node <p>Current node</p>
     */
    public FileMeta getNode() {
        return this.Node;
    }

    /**
     * Set <p>Current node</p>
     * @param Node <p>Current node</p>
     */
    public void setNode(FileMeta Node) {
        this.Node = Node;
    }

    /**
     * Get <p>Parent node</p> 
     * @return Parent <p>Parent node</p>
     */
    public FileMeta getParent() {
        return this.Parent;
    }

    /**
     * Set <p>Parent node</p>
     * @param Parent <p>Parent node</p>
     */
    public void setParent(FileMeta Parent) {
        this.Parent = Parent;
    }

    /**
     * Get <p>Creator</p> 
     * @return Creator <p>Creator</p>
     */
    public UserInfo getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>Creator</p>
     * @param Creator <p>Creator</p>
     */
    public void setCreator(UserInfo Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>Owner</p> 
     * @return Owner <p>Owner</p>
     */
    public UserInfo getOwner() {
        return this.Owner;
    }

    /**
     * Set <p>Owner</p>
     * @param Owner <p>Owner</p>
     */
    public void setOwner(UserInfo Owner) {
        this.Owner = Owner;
    }

    /**
     * Get <p>Node type.</p> 
     * @return NodeType <p>Node type.</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>Node type.</p>
     * @param NodeType <p>Node type.</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>Original path</p> 
     * @return OriginPath <p>Original path</p>
     */
    public String getOriginPath() {
        return this.OriginPath;
    }

    /**
     * Set <p>Original path</p>
     * @param OriginPath <p>Original path</p>
     */
    public void setOriginPath(String OriginPath) {
        this.OriginPath = OriginPath;
    }

    /**
     * Get <p>Recycle time</p> 
     * @return DeleteTime <p>Recycle time</p>
     */
    public String getDeleteTime() {
        return this.DeleteTime;
    }

    /**
     * Set <p>Recycle time</p>
     * @param DeleteTime <p>Recycle time</p>
     */
    public void setDeleteTime(String DeleteTime) {
        this.DeleteTime = DeleteTime;
    }

    /**
     * Get <p>File git configuration.</p> 
     * @return GitConfig <p>File git configuration.</p>
     */
    public GitRepoConfig getGitConfig() {
        return this.GitConfig;
    }

    /**
     * Set <p>File git configuration.</p>
     * @param GitConfig <p>File git configuration.</p>
     */
    public void setGitConfig(GitRepoConfig GitConfig) {
        this.GitConfig = GitConfig;
    }

    public FileNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileNode(FileNode source) {
        if (source.Node != null) {
            this.Node = new FileMeta(source.Node);
        }
        if (source.Parent != null) {
            this.Parent = new FileMeta(source.Parent);
        }
        if (source.Creator != null) {
            this.Creator = new UserInfo(source.Creator);
        }
        if (source.Owner != null) {
            this.Owner = new UserInfo(source.Owner);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.OriginPath != null) {
            this.OriginPath = new String(source.OriginPath);
        }
        if (source.DeleteTime != null) {
            this.DeleteTime = new String(source.DeleteTime);
        }
        if (source.GitConfig != null) {
            this.GitConfig = new GitRepoConfig(source.GitConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Node.", this.Node);
        this.setParamObj(map, prefix + "Parent.", this.Parent);
        this.setParamObj(map, prefix + "Creator.", this.Creator);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "OriginPath", this.OriginPath);
        this.setParamSimple(map, prefix + "DeleteTime", this.DeleteTime);
        this.setParamObj(map, prefix + "GitConfig.", this.GitConfig);

    }
}

