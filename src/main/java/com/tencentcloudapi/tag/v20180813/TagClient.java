/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tag.v20180813;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tag.v20180813.models.*;

public class TagClient extends AbstractClient{
    private static String endpoint = "tag.tencentcloudapi.com";
    private static String version = "2018-08-13";

    public TagClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TagClient(Credential credential, String region, ClientProfile profile) {
        super(TagClient.endpoint, TagClient.version, credential, region, profile);
    }

    /**
     *This API is used to associate resources with tags.
     * @param req AddResourceTagRequest
     * @return AddResourceTagResponse
     * @throws TencentCloudSDKException
     */
    public AddResourceTagResponse AddResourceTag(AddResourceTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddResourceTagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddResourceTagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddResourceTag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a tag key and tag value pair.
     * @param req CreateTagRequest
     * @return CreateTagResponse
     * @throws TencentCloudSDKException
     */
    public CreateTagResponse CreateTag(CreateTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to unassociate tags and resources.
     * @param req DeleteResourceTagRequest
     * @return DeleteResourceTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceTagResponse DeleteResourceTag(DeleteResourceTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteResourceTagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteResourceTagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteResourceTag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a tag key and tag value pair.
     * @param req DeleteTagRequest
     * @return DeleteTagResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTagResponse DeleteTag(DeleteTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the tags associated with a resource.
     * @param req DescribeResourceTagsRequest
     * @return DescribeResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsResponse DescribeResourceTags(DescribeResourceTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceTagsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceTagsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeResourceTags"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query tag key and value pairs for existing resources.
     * @param req DescribeResourceTagsByResourceIdsRequest
     * @return DescribeResourceTagsByResourceIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsByResourceIdsResponse DescribeResourceTagsByResourceIds(DescribeResourceTagsByResourceIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceTagsByResourceIdsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceTagsByResourceIdsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeResourceTagsByResourceIds"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get resource tags based on tag keys.
     * @param req DescribeResourceTagsByTagKeysRequest
     * @return DescribeResourceTagsByTagKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsByTagKeysResponse DescribeResourceTagsByTagKeys(DescribeResourceTagsByTagKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceTagsByTagKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceTagsByTagKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeResourceTagsByTagKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query resources by tags.
     * @param req DescribeResourcesByTagsRequest
     * @return DescribeResourcesByTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesByTagsResponse DescribeResourcesByTags(DescribeResourcesByTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourcesByTagsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcesByTagsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeResourcesByTags"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query tag keys in an existing tag list.

     * @param req DescribeTagKeysRequest
     * @return DescribeTagKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagKeysResponse DescribeTagKeys(DescribeTagKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTagKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query tag values in an existing tag list.
     * @param req DescribeTagValuesRequest
     * @return DescribeTagValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagValuesResponse DescribeTagValues(DescribeTagValuesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagValuesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagValuesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTagValues"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query existing tag lists.

     * @param req DescribeTagsRequest
     * @return DescribeTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTagsResponse DescribeTags(DescribeTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTagsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTagsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTags"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify all tags associated with a resource.
     * @param req ModifyResourceTagsRequest
     * @return ModifyResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceTagsResponse ModifyResourceTags(ModifyResourceTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourceTagsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourceTagsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyResourceTags"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the values of tags associated with a resource (the tag key does not change).
     * @param req UpdateResourceTagValueRequest
     * @return UpdateResourceTagValueResponse
     * @throws TencentCloudSDKException
     */
    public UpdateResourceTagValueResponse UpdateResourceTagValue(UpdateResourceTagValueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateResourceTagValueResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateResourceTagValueResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateResourceTagValue"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
