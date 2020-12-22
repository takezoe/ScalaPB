// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

/** Describes the relationship between generated code and its original source
  * file. A GeneratedCodeInfo message is associated with only one generated
  * source file, but may contain references to different source .proto files.
  *
  * @param annotation
  *   An Annotation connects some span of text in generated code to an element
  *   of its generating .proto file.
  */
@SerialVersionUID(0L)
final case class GeneratedCodeInfo(
    annotation: _root_.scala.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] = _root_.scala.Seq.empty,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[GeneratedCodeInfo] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      annotation.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      annotation.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      unknownFields.writeTo(_output__)
    }
    def clearAnnotation = copy(annotation = _root_.scala.Seq.empty)
    def addAnnotation(__vs: com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation*): GeneratedCodeInfo = addAllAnnotation(__vs)
    def addAllAnnotation(__vs: Iterable[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]): GeneratedCodeInfo = copy(annotation = annotation ++ __vs)
    def withAnnotation(__v: _root_.scala.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]): GeneratedCodeInfo = copy(annotation = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => annotation
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(annotation.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.GeneratedCodeInfo
}

object GeneratedCodeInfo extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo] = this
  override def parseFrom(input: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.GeneratedCodeInfo = newBuilder.merge(input).result()
  def merge(`_message__`: com.google.protobuf.descriptor.GeneratedCodeInfo, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.GeneratedCodeInfo = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.GeneratedCodeInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.descriptor.GeneratedCodeInfo(
        annotation = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.javaDescriptor.getMessageTypes().get(20)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DescriptorProtoCompanion.scalaDescriptor.messages(20)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.descriptor.GeneratedCodeInfo(
    annotation = _root_.scala.Seq.empty
  )
  final class Builder private (
    private var __annotation: collection.mutable.Builder[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation, _root_.scala.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]],
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.descriptor.GeneratedCodeInfo] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __annotation += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.defaultInstance)
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): com.google.protobuf.descriptor.GeneratedCodeInfo = {
      com.google.protobuf.descriptor.GeneratedCodeInfo(
          annotation = __annotation.result(),
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo, com.google.protobuf.descriptor.GeneratedCodeInfo.Builder] {
    def apply(): Builder = new Builder(
      __annotation = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation],
      `_unknownFields__` = null
    )
    def apply(`_message__`: com.google.protobuf.descriptor.GeneratedCodeInfo): Builder = new Builder(
      __annotation = _root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] ++= _message__.annotation,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = com.google.protobuf.descriptor.GeneratedCodeInfo.Builder()
  def newBuilder(a: com.google.protobuf.descriptor.GeneratedCodeInfo): Builder = com.google.protobuf.descriptor.GeneratedCodeInfo.Builder(a)
  /** @param path
    *   Identifies the element in the original source .proto file. This field
    *   is formatted the same as SourceCodeInfo.Location.path.
    * @param sourceFile
    *   Identifies the filesystem path to the original source .proto.
    * @param begin
    *   Identifies the starting offset in bytes in the generated code
    *   that relates to the identified object.
    * @param end
    *   Identifies the ending offset in bytes in the generated code that
    *   relates to the identified offset. The end offset should be one past
    *   the last relevant byte (so the length of the text = end - begin).
    */
  @SerialVersionUID(0L)
  final case class Annotation(
      path: _root_.scala.Seq[_root_.scala.Int] = _root_.scala.Seq.empty,
      sourceFile: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
      begin: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
      end: _root_.scala.Option[_root_.scala.Int] = _root_.scala.None,
      unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
      ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Annotation] {
      private[this] def pathSerializedSize = {
        if (__pathSerializedSizeField == 0) __pathSerializedSizeField = {
          var __s: _root_.scala.Int = 0
          path.foreach(__i => __s += _root_.com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(__i))
          __s
        }
        __pathSerializedSizeField
      }
      @transient private[this] var __pathSerializedSizeField: _root_.scala.Int = 0
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        if (path.nonEmpty) {
          val __localsize = pathSerializedSize
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
        }
        if (sourceFile.isDefined) {
          val __value = sourceFile.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        };
        if (begin.isDefined) {
          val __value = begin.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, __value)
        };
        if (end.isDefined) {
          val __value = end.get
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(4, __value)
        };
        __size += unknownFields.serializedSize
        __size
      }
      override def serializedSize: _root_.scala.Int = {
        var read = __serializedSizeCachedValue
        if (read == 0) {
          read = __computeSerializedValue()
          __serializedSizeCachedValue = read
        }
        read
      }
      def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
        if (path.nonEmpty) {
          _output__.writeTag(1, 2)
          _output__.writeUInt32NoTag(pathSerializedSize)
          path.foreach(_output__.writeInt32NoTag)
        };
        sourceFile.foreach { __v =>
          val __m = __v
          _output__.writeString(2, __m)
        };
        begin.foreach { __v =>
          val __m = __v
          _output__.writeInt32(3, __m)
        };
        end.foreach { __v =>
          val __m = __v
          _output__.writeInt32(4, __m)
        };
        unknownFields.writeTo(_output__)
      }
      def clearPath = copy(path = _root_.scala.Seq.empty)
      def addPath(__vs: _root_.scala.Int*): Annotation = addAllPath(__vs)
      def addAllPath(__vs: Iterable[_root_.scala.Int]): Annotation = copy(path = path ++ __vs)
      def withPath(__v: _root_.scala.Seq[_root_.scala.Int]): Annotation = copy(path = __v)
      def getSourceFile: _root_.scala.Predef.String = sourceFile.getOrElse("")
      def clearSourceFile: Annotation = copy(sourceFile = _root_.scala.None)
      def withSourceFile(__v: _root_.scala.Predef.String): Annotation = copy(sourceFile = Option(__v))
      def getBegin: _root_.scala.Int = begin.getOrElse(0)
      def clearBegin: Annotation = copy(begin = _root_.scala.None)
      def withBegin(__v: _root_.scala.Int): Annotation = copy(begin = Option(__v))
      def getEnd: _root_.scala.Int = end.getOrElse(0)
      def clearEnd: Annotation = copy(end = _root_.scala.None)
      def withEnd(__v: _root_.scala.Int): Annotation = copy(end = Option(__v))
      def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
      def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => path
          case 2 => sourceFile.orNull
          case 3 => begin.orNull
          case 4 => end.orNull
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PRepeated(path.iterator.map(_root_.scalapb.descriptors.PInt).toVector)
          case 2 => sourceFile.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 3 => begin.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
          case 4 => end.map(_root_.scalapb.descriptors.PInt).getOrElse(_root_.scalapb.descriptors.PEmpty)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation
  }
  
  object Annotation extends scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] = this
    override def parseFrom(input: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation = newBuilder.merge(input).result()
    def merge(`_message__`: com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation, `_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation = newBuilder(_message__).merge(_input__).result()
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
          path = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[_root_.scala.Int]]).getOrElse(_root_.scala.Seq.empty),
          sourceFile = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
          begin = __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]]),
          end = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Int]])
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.GeneratedCodeInfo.javaDescriptor.getNestedTypes().get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.protobuf.descriptor.GeneratedCodeInfo.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
      path = _root_.scala.Seq.empty,
      sourceFile = _root_.scala.None,
      begin = _root_.scala.None,
      end = _root_.scala.None
    )
    final class Builder private (
      private var __path: collection.mutable.Builder[_root_.scala.Int, _root_.scala.Seq[_root_.scala.Int]],
      private var __sourceFile: _root_.scala.Option[_root_.scala.Predef.String],
      private var __begin: _root_.scala.Option[_root_.scala.Int],
      private var __end: _root_.scala.Option[_root_.scala.Int],
      private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
    ) extends _root_.scalapb.MessageBuilder[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation] {
      def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 8 =>
              __path += _input__.readInt32()
            case 10 => {
              val length = _input__.readRawVarint32()
              val oldLimit = _input__.pushLimit(length)
              while (_input__.getBytesUntilLimit > 0) {
                __path += _input__.readInt32()
              }
              _input__.popLimit(oldLimit)
            }
            case 18 =>
              __sourceFile = Option(_input__.readStringRequireUtf8())
            case 24 =>
              __begin = Option(_input__.readInt32())
            case 32 =>
              __end = Option(_input__.readInt32())
            case tag =>
              if (_unknownFields__ == null) {
                _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
              }
              _unknownFields__.parseField(tag, _input__)
          }
        }
        this
      }
      def result(): com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation = {
        com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
            path = __path.result(),
            sourceFile = __sourceFile,
            begin = __begin,
            end = __end,
            unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
        )
      }
    }
    object Builder extends _root_.scalapb.MessageBuilderCompanion[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Builder] {
      def apply(): Builder = new Builder(
        __path = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Int],
        __sourceFile = _root_.scala.None,
        __begin = _root_.scala.None,
        __end = _root_.scala.None,
        `_unknownFields__` = null
      )
      def apply(`_message__`: com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation): Builder = new Builder(
        __path = _root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Int] ++= _message__.path,
        __sourceFile = _message__.sourceFile,
        __begin = _message__.begin,
        __end = _message__.end,
        `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
      )
    }
    def newBuilder: Builder = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Builder()
    def newBuilder(a: com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation): Builder = com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation.Builder(a)
    implicit class AnnotationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation](_l) {
      def path: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Int]] = field(_.path)((c_, f_) => c_.copy(path = f_))
      def sourceFile: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getSourceFile)((c_, f_) => c_.copy(sourceFile = Option(f_)))
      def optionalSourceFile: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.sourceFile)((c_, f_) => c_.copy(sourceFile = f_))
      def begin: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getBegin)((c_, f_) => c_.copy(begin = Option(f_)))
      def optionalBegin: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.begin)((c_, f_) => c_.copy(begin = f_))
      def end: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.getEnd)((c_, f_) => c_.copy(end = Option(f_)))
      def optionalEnd: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Int]] = field(_.end)((c_, f_) => c_.copy(end = f_))
    }
    final val PATH_FIELD_NUMBER = 1
    final val SOURCE_FILE_FIELD_NUMBER = 2
    final val BEGIN_FIELD_NUMBER = 3
    final val END_FIELD_NUMBER = 4
    def of(
      path: _root_.scala.Seq[_root_.scala.Int],
      sourceFile: _root_.scala.Option[_root_.scala.Predef.String],
      begin: _root_.scala.Option[_root_.scala.Int],
      end: _root_.scala.Option[_root_.scala.Int]
    ): _root_.com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation = _root_.com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation(
      path,
      sourceFile,
      begin,
      end
    )
    // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.GeneratedCodeInfo.Annotation])
  }
  
  implicit class GeneratedCodeInfoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.GeneratedCodeInfo](_l) {
    def annotation: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]] = field(_.annotation)((c_, f_) => c_.copy(annotation = f_))
  }
  final val ANNOTATION_FIELD_NUMBER = 1
  def of(
    annotation: _root_.scala.Seq[com.google.protobuf.descriptor.GeneratedCodeInfo.Annotation]
  ): _root_.com.google.protobuf.descriptor.GeneratedCodeInfo = _root_.com.google.protobuf.descriptor.GeneratedCodeInfo(
    annotation
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[google.protobuf.GeneratedCodeInfo])
}
