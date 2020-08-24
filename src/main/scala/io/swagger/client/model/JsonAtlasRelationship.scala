/**
 * Atlas REST API
 * Atlas exposes a variety of REST endpoints to work with types, entities, lineage and data discovery.
 *
 * OpenAPI spec version: 2.0.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class JsonAtlasRelationship (
  // 
  attributes: Option[Map[String, Any]] = None,
  // 
  typeName: Option[String] = None,
  // 
  blockedPropagatedClassifications: Option[List[JsonAtlasClassification]] = None,
  // 
  createTime: Option[Number] = None,
  // 
  createdBy: Option[String] = None,
  end1: Option[JsonAtlasObjectId] = None,
  end2: Option[JsonAtlasObjectId] = None,
  // 
  guid: Option[String] = None,
  // 
  homeId: Option[String] = None,
  // 
  label: Option[String] = None,
  propagateTags: Option[JsonPropagateTags] = None,
  // 
  propagatedClassifications: Option[List[JsonAtlasClassification]] = None,
  // 
  provenanceType: Option[Number] = None,
  status: Option[JsonStatusAtlasRelationship] = None,
  // 
  updateTime: Option[Number] = None,
  // 
  updatedBy: Option[String] = None,
  // 
  version: Option[Number] = None
)

