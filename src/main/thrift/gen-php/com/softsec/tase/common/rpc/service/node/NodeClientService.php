<?php
namespace com\softsec\tase\common\rpc\service\node;
/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Exception\TApplicationException;


interface NodeClientServiceIf {
  public function obtainQueueInfo();
}

class NodeClientServiceClient implements \com\softsec\tase\common\rpc\service\node\NodeClientServiceIf {
  protected $input_ = null;
  protected $output_ = null;

  protected $seqid_ = 0;

  public function __construct($input, $output=null) {
    $this->input_ = $input;
    $this->output_ = $output ? $output : $input;
  }

  public function obtainQueueInfo()
  {
    $this->send_obtainQueueInfo();
    return $this->recv_obtainQueueInfo();
  }

  public function send_obtainQueueInfo()
  {
    $args = new \com\softsec\tase\common\rpc\service\node\NodeClientService_obtainQueueInfo_args();
    $bin_accel = ($this->output_ instanceof TProtocol::$TBINARYPROTOCOLACCELERATED) && function_exists('thrift_protocol_write_binary');
    if ($bin_accel)
    {
      thrift_protocol_write_binary($this->output_, 'obtainQueueInfo', TMessageType::CALL, $args, $this->seqid_, $this->output_->isStrictWrite());
    }
    else
    {
      $this->output_->writeMessageBegin('obtainQueueInfo', TMessageType::CALL, $this->seqid_);
      $args->write($this->output_);
      $this->output_->writeMessageEnd();
      $this->output_->getTransport()->flush();
    }
  }

  public function recv_obtainQueueInfo()
  {
    $bin_accel = ($this->input_ instanceof TProtocol::$TBINARYPROTOCOLACCELERATED) && function_exists('thrift_protocol_read_binary');
    if ($bin_accel) $result = thrift_protocol_read_binary($this->input_, '\com\softsec\tase\common\rpc\service\node\NodeClientService_obtainQueueInfo_result', $this->input_->isStrictRead());
    else
    {
      $rseqid = 0;
      $fname = null;
      $mtype = 0;

      $this->input_->readMessageBegin($fname, $mtype, $rseqid);
      if ($mtype == TMessageType::EXCEPTION) {
        $x = new TApplicationException();
        $x->read($this->input_);
        $this->input_->readMessageEnd();
        throw $x;
      }
      $result = new \com\softsec\tase\common\rpc\service\node\NodeClientService_obtainQueueInfo_result();
      $result->read($this->input_);
      $this->input_->readMessageEnd();
    }
    if ($result->success !== null) {
      return $result->success;
    }
    if ($result->ue !== null) {
      throw $result->ue;
    }
    if ($result->te !== null) {
      throw $result->te;
    }
    throw new \Exception("obtainQueueInfo failed: unknown result");
  }

}

// HELPER FUNCTIONS AND STRUCTURES

class NodeClientService_obtainQueueInfo_args {
  static $_TSPEC;


  public function __construct() {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        );
    }
  }

  public function getName() {
    return 'NodeClientService_obtainQueueInfo_args';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('NodeClientService_obtainQueueInfo_args');
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class NodeClientService_obtainQueueInfo_result {
  static $_TSPEC;

  public $success = null;
  public $ue = null;
  public $te = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        0 => array(
          'var' => 'success',
          'type' => TType::STRING,
          ),
        1 => array(
          'var' => 'ue',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\UnavailableException',
          ),
        2 => array(
          'var' => 'te',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\TimeoutException',
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['success'])) {
        $this->success = $vals['success'];
      }
      if (isset($vals['ue'])) {
        $this->ue = $vals['ue'];
      }
      if (isset($vals['te'])) {
        $this->te = $vals['te'];
      }
    }
  }

  public function getName() {
    return 'NodeClientService_obtainQueueInfo_result';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 0:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->success);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 1:
          if ($ftype == TType::STRUCT) {
            $this->ue = new \com\softsec\tase\common\rpc\exception\UnavailableException();
            $xfer += $this->ue->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRUCT) {
            $this->te = new \com\softsec\tase\common\rpc\exception\TimeoutException();
            $xfer += $this->te->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('NodeClientService_obtainQueueInfo_result');
    if ($this->success !== null) {
      $xfer += $output->writeFieldBegin('success', TType::STRING, 0);
      $xfer += $output->writeString($this->success);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->ue !== null) {
      $xfer += $output->writeFieldBegin('ue', TType::STRUCT, 1);
      $xfer += $this->ue->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->te !== null) {
      $xfer += $output->writeFieldBegin('te', TType::STRUCT, 2);
      $xfer += $this->te->write($output);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}


